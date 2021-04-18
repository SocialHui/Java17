package service;

import com.fasterxml.jackson.databind.ObjectMapper;
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

/**
 * 登录
 */
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int state = -1;
        String msg = "";

        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");

        if (username != null && !username.equals("") && pwd != null && !pwd.equals("")) {
            UserInfo userInfo = new UserInfo();
            userInfo.setUsername(username);
            userInfo.setPassword(pwd);

            UserInfoDao userInfoDao = new UserInfoDao();
            try {
                boolean res = userInfoDao.isLogin(userInfo);
                if (res) {
                    state = 200;
                } else {
                    state = 100;
                }

                //在这里给用户信息创建一个session，以便后面使用
                userInfo = userInfoDao.getUserInfo(userInfo);
                if (userInfo.getId() >= 1) {
                    //代表登录成功
                    state = 200;

                    HttpSession session = request.getSession(true);
                    session.setAttribute("userInfo",userInfo);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {
            msg = "参数传递不全";
        }
        HashMap<String,Object> map = new HashMap<>();
        map.put("state",state);
        map.put("msg",msg);
        ObjectMapper mapper = new ObjectMapper();
        ResultJSONUtils.write(response,mapper.writeValueAsString(map));
    }
}
