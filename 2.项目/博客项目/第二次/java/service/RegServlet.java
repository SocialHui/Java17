package service;
//公共服务系统

import dao.UserInfoDao;
import models.UserINfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class RegServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json"); //注意数据类型

        int state = -1;  //200表示接口执行成功
        String msg = "";
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();

        //永远不相信前端传过来的参数
        //所以在这下面进行判断
        if (username == null || password == null || username.equals("") || password.equals("")) {
            //参数不正确
            msg = "参数不正确";
        } else {


            /**
             * 扩展1
             *
             * 在这里可以先去判断一下这个用户是否已经存在，
             * 如果已经存在，则不能进行注册
             * 将用户名作为判断用户是否存在的唯一标准
             *
             * 不能将用户名和密码作为判断用户是否存在的唯一标准
             * 如果这样的话，这个用户若是注册失败，他就知道了别人的用户名和密码
             */



            UserINfo userINfo = new UserINfo();
            userINfo.setUsername(username);
            userINfo.setPassword(password);

            UserInfoDao userInfoDao = new UserInfoDao();
            try {
                boolean res = userInfoDao.add(userINfo);
                if (res) {
                    state = 200;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        // {"state":200,"msg":""}
        writer.println("{\"state\":"+state+",\"msg\":\""+msg+"\"}");
    }
}
