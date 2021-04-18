package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.ArticleInfoDao;
import dao.UserInfoDao;
import models.UserInfo;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

public class AddArtServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = "";
        int state = 100;

        String title = request.getParameter("title");
        String content = request.getParameter("content");

        if (title != null && !title.equals("") && content != null && !content.equals("")) {
            //给文章插入的时候要插入标题，正文，和uid
            HttpSession session = request.getSession(false);
            if (session != null && session.getAttribute("userInfo") != null) {
                //代表处于登录状态
                //获取用户对象
                UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
                //获取用户对象
                int uid = userInfo.getId();
                ArticleInfoDao articleInfoDao = new ArticleInfoDao();
                int ret = 0;
                try {
                    ret = articleInfoDao.addArt(title,content,uid);
                    if (ret >= 1) {
                        //添加成功
                        state = 200;
                    } else {
                        msg = "添加失败";
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } else {
                msg = "未登录，请先登录";
            }
        } else {
            msg = "参数传递不全";
        }

        HashMap<String,Object> map = new HashMap<>();
        map.put("msg",msg);
        map.put("state",state);
        ObjectMapper mapper = new ObjectMapper();
        ResultJSONUtils.write(response,mapper.writeValueAsString(map));
    }
}
