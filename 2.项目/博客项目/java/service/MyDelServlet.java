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

public class MyDelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = "";
        int succ = 100;

        //接收前端参数
        int id = Integer.parseInt(request.getParameter("id"));

        if (id >= 1) {
            //代表文章id有效
            succ = 200;
            //进行文章删除操作
            ArticleInfoDao articleInfoDao = new ArticleInfoDao();
            int ret = 0;
            try {
                ret = articleInfoDao.del(id);
                if (ret >= 1) {
                    //代表删除成功
                    succ = 200;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {
            //未登录状态
            msg = "文章id无效";
        }

        HashMap<String,Object> map = new HashMap<>();
        map.put("msg",msg);
        map.put("succ",succ);
        ObjectMapper mapper = new ObjectMapper();
        ResultJSONUtils.write(response,mapper.writeValueAsString(map));
    }
}
