package service;

import dao.ArticleInfoDao;
import models.ArticleInfo;
import models.vo.ArticleInfoVO;
import utils.ResultJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;


@WebServlet("/list")
public class ListServlrt extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 当前页码
        int cpage = Integer.parseInt(req.getParameter("cpage"));
        // 每页显示条数
        int psize = Integer.parseInt(req.getParameter("psize"));

        String msg = "";
        int succ = -1;
        List<ArticleInfoVO> list = null;

        ArticleInfoDao dao = new ArticleInfoDao();
/*        try {
            list = dao.getList();
            succ = 1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }*/
        try {
            list = dao.getListByPage(cpage,psize);
            succ = 1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        HashMap<String,Object> map = new HashMap<>();
        map.put("succ",succ);
        map.put("msg",msg);
        map.put("list",list);
        ResultJSONUtils.writeMap(resp,map);
    }
}
