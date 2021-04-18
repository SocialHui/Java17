package service;

import dao.ArticleInfoDao;
import dao.UserInfoDao;
import models.ArticleInfo;
import models.UserINfo;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public class MyArtServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int state = -1;
        String msg = "";
        List<ArticleInfo> list = null;
        //1.权限验证
        //传值必须是false
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("userINfo") == null) {
            //说明用户没有登录
            state = 100;
            msg = "当前用户未登录";
        } else {
            UserINfo userINfo = (UserINfo) session.getAttribute("userINfo");
            int uid = userINfo.getId();
            //去数据库查询信息
            ArticleInfoDao articleInfoDao = new ArticleInfoDao();
            try {
                list = articleInfoDao.getMyArtList(uid);
                //代表查询成功
                state = 200;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        HashMap<String,Object> map = new HashMap<>();
        map.put("state",state);
        map.put("msg",msg);
        map.put("list",list);
        ResultJSONUtils.writeMap(response,map);
    }
}
