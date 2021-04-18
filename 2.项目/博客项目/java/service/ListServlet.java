package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.ArticleInfoDao;
import models.ArticleInfo;
import models.vo.ArticleInfoVO;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int state = 100;
        String msg = "";

        int cpage = Integer.parseInt(request.getParameter("cpage"));  //当前页码
        int psize = Integer.parseInt(request.getParameter("psize"));  //每页显示最大条数

        List<ArticleInfoVO> list = new ArrayList<>();

        ArticleInfoDao articleInfoDao = new ArticleInfoDao();
        //不分页
        //list = articleInfoDao.getList();
        //分页查询
        try {
            list = articleInfoDao.getListByPage(cpage,psize);
            if (list != null) {
                state = 200;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        HashMap<String,Object> map = new HashMap<>();
        map.put("msg",msg);
        map.put("state",state);
        map.put("list",list);
        ObjectMapper mapper = new ObjectMapper();
        ResultJSONUtils.write(response,mapper.writeValueAsString(map));
    }
}
