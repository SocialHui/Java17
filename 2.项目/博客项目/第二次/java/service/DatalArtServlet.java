package service;

import dao.ArticleInfoDao;
import models.vo.ArticleInfoVO;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

public class DatalArtServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int state = 100;
        String msg = "";

        //接收文章的id
        int id = Integer.parseInt(request.getParameter("id"));

        ArticleInfoVO articleInfoVO = new ArticleInfoVO();
        ArticleInfoDao articleInfoDao = new ArticleInfoDao();
        try {
            articleInfoVO = articleInfoDao.getDetailArtById(id);
            if (articleInfoVO != null) {
                state = 200;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        HashMap<String, Object> map = new HashMap<>();
        map.put("state",state);
        map.put("msg",msg);
        map.put("art",articleInfoVO);
        ResultJSONUtils.writeMap(response,map);
    }
}
