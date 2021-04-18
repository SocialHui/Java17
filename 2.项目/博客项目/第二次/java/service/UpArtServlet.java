package service;

import dao.ArticleInfoDao;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.transform.Result;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

public class UpArtServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 接收参数
         *
         * 去数据库进行操作
         *
         * 返回结果给前端
         */

        String msg = "";
        int succ = -1;

        String title = request.getParameter("title");
        String content = request.getParameter("content");
        int id = Integer.parseInt(request.getParameter("id"));

        if (title != null && !title.equals("") && content != null && !content.equals("") && id > 0) {
            //代编参数传递是正确的
            //接下来就可以去数据库进行操作了

            HttpSession session = request.getSession(false);
            if (session != null && session.getAttribute("userINfo") != null) {

                //代表是登录状态
                ArticleInfoDao articleInfoDao = new ArticleInfoDao();
                try {
                    succ = articleInfoDao.upArt(title,content,id);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

            } else {
                //代表是非登录状态
                msg = "未登录，操作失败";
            }

        } else {
            msg = "参数传递不正确";
        }

        HashMap<String, Object> map = new HashMap<>();
        map.put("msg",msg);
        map.put("succ",succ);
        ResultJSONUtils.writeMap(response,map);
    }
}
