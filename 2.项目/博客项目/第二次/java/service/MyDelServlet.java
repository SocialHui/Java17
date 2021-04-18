package service;

import dao.ArticleInfoDao;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

public class MyDelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int succ = -1;
        String msg = "";

        int id = Integer.parseInt(request.getParameter("id"));

        if (id >= 0) {
            //代表参数有效，进行操作
            ArticleInfoDao articleInfoDao = new ArticleInfoDao();
            int res = 0;
            try {
                res = articleInfoDao.delArtileById(id);
                if (res > 0) {
                    //代表删除成功
                    succ = 1;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {
            msg = "参数无效";
        }

        HashMap<String,Object> map = new HashMap<>();
        map.put("succ",succ);
        map.put("msg",msg);
        ResultJSONUtils.writeMap(response,map);
    }
}
