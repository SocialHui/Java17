package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.ArticleInfoDao;
import dao.UserInfoDao;
import models.ArticleInfo;
import models.UserInfo;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyArtServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String msg = "";
        int state = 100;

        List<ArticleInfo> list = new ArrayList<>();

        //去数据库操作
        //此时要根据作者的id去数据库查询个人的文章
        //所以在登陆的时候要将id存储在会话信息中
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("userInfo") != null) {
            ArticleInfoDao articleInfoDao = new ArticleInfoDao();
            UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
            int uid = userInfo.getId();
            state = 200; //代表这个时候是登录状态

            try {
                list = articleInfoDao.grtMyArtList(uid);

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {
            msg = "未登录，请先登录";
        }

        //返回
        HashMap<String,Object> map = new HashMap<>();
        map.put("msg",msg);
        map.put("state",state);
        map.put("list",list);
        ObjectMapper mapper = new ObjectMapper();
        ResultJSONUtils.write(response,mapper.writeValueAsString(map));
    }
}
