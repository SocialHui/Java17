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

public class RcountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        int state = 100;
        String msg = "";
        ArticleInfoDao articleInfoDao = new ArticleInfoDao();
        int ret = 0;
        try {
            ret = articleInfoDao.getRcountById(id);
            if (ret >=1){
                state = 200;
            } else {
                msg = "+1失败";
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        HashMap<String, Object> map = new HashMap<>();
        map.put("state",state);
        map.put("msg",msg);
        ResultJSONUtils.writeMap(response,map);
    }
}
