package service;

import dao.UserInfoDao;
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

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = "";
        int state  = -1;

        //获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username != null && password != null && !username.equals("")) {
            //调用数据库验证用户名和密码
            UserINfo userINfo = new UserINfo();
            userINfo.setUsername(username);
            userINfo.setPassword(password);
            UserInfoDao userInfoDao = new UserInfoDao();
            try {
                boolean res = userInfoDao.isLogin(userINfo);
                if (res) {
                    state = 200;
                } else {
                    state = 100;
                }
                //下面这一句是为了后面文章获取userINfo的id
                userINfo = userInfoDao.getUserInfo(userINfo);
                if (userINfo.getId() >= 1) {
                    //代表登录成功
                    state = 200;

                    //登录成功以后创建一个session对象，方便后面文章用到
                    HttpSession session = request.getSession(true);
                    //将当前用户存到session中
                    session.setAttribute("userINfo",userINfo);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {
            msg = "参数不全";
        }

        //将信息返回给前台
        HashMap<String, Object> map = new HashMap<>();
        map.put("state",state);
        map.put("msg",msg);
        ResultJSONUtils.writeMap(response,map);
    }
}
