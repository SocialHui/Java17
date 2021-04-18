package service;

import dao.ArticleInfoDao;
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

public class AddArtServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int succ = -1;
        String msg = "咳咳";

        String title = request.getParameter("title");
        String content = request.getParameter("content");

        if (title != null && content != null && !title.equals("") && !content.equals("")) {
            //在数据库进行添加操作

            //获取uid
            //必须给一个false，不重新创建一个session信息
            HttpSession session = request.getSession(false);
            if (session != null && session.getAttribute("userINfo") != null) {
                //代表是登录状态
                UserINfo userINfo = (UserINfo) session.getAttribute("userINfo");

                ArticleInfoDao articleInfoDao = new ArticleInfoDao();
                try {
                    succ = articleInfoDao.add(title,content,userINfo.getId());
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } else {
                msg = "未登录状态，请先登录";
            }
        } else {
            msg = "参数不完整，请重新输入";
        }

        HashMap<String,Object> map = new HashMap<>();
        map.put("msg",msg);
        map.put("succ",succ);
        ResultJSONUtils.writeMap(response,map);
    }
}
