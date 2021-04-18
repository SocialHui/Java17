package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.ArticleInfoDao;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

public class UpArtServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = "";
        int state = 100;

        //获取文章的id
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        if (title != null && !title.equals("") && content != null && !content.equals("") && id >= 1) {
            ArticleInfoDao articleInfoDao = new ArticleInfoDao();
            try {
                int ret = articleInfoDao.upArt(title,content,id);
                if (ret >= 1) {
                    //代表修改成功
                    state = 200;
                } else {
                    msg = "修改失败";
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {
            msg = "文章id有误";
        }

        HashMap<String,Object> map = new HashMap<>();
        map.put("msg",msg);
        map.put("state",state);
        ObjectMapper mapper = new ObjectMapper();
        ResultJSONUtils.write(response,mapper.writeValueAsString(map));
    }
}
