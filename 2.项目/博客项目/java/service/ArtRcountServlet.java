package service;

import com.fasterxml.jackson.databind.ObjectMapper;
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

public class ArtRcountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = "";
        int state = 100;

        //接收文章的id
        int id = Integer.parseInt(request.getParameter("id"));
        ArticleInfoDao articleInfoDao = new ArticleInfoDao();
        try {
            int ret = articleInfoDao.setRcount(id);
            if (ret >= 1) {
                state = 200;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        HashMap<String,Object> map = new HashMap<>();
        map.put("msg",msg);
        map.put("state",state);
        ObjectMapper mapper = new ObjectMapper();
        ResultJSONUtils.write(response,mapper.writeValueAsString(map));
    }
}
