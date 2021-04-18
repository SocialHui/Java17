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

public class InitArtServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    //修改文章
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        String msg = "";
        int state = 100;

        ArticleInfo articleInfo = new ArticleInfo();

        if (id >= 1) {
            //代表正确的获取到了文章的id，去数据库查询文章的内容
            ArticleInfoDao articleInfoDao = new ArticleInfoDao();
            try {
                articleInfo = articleInfoDao.getArtById(id);
                if (articleInfo != null) {
                    //代表查询到文章相关的内容
                    state = 200;
                } else {
                    msg = "未查询到文章内容";
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {
            msg = "文章id有误";
        }
        HashMap<String,Object> map = new HashMap<>();
        map.put("state",state);
        map.put("msg",msg);
        map.put("articleinfo",articleInfo);
        ObjectMapper mapper = new ObjectMapper();
        ResultJSONUtils.write(response,mapper.writeValueAsString(map));
    }
}
