package service;

import dao.ArticleInfoDao;
import models.ArticleInfo;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

public class InitArtServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int state = -1;
        String msg = "";

        ArticleInfo articleInfo = null;

        int id = Integer.parseInt(request.getParameter("id"));
        if (id > 0) {
            //参数正确，操作数据库
            ArticleInfoDao articleInfoDao = new ArticleInfoDao();
            try {
                articleInfo = articleInfoDao.getMyAry(id);
                state = 1;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            state = 1;
        } else {
            msg = "操作失败，参数不正确";
        }

        HashMap<String,Object> map = new HashMap<>();
        map.put("msg",msg);
        map.put("state",state);
        map.put("articleinfo",articleInfo);
        ResultJSONUtils.writeMap(response,map);
    }
}
