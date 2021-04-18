package dao;

import models.ArticleInfo;
import models.vo.ArticleInfoVO;
import utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleInfoDao {

    //获取我的文章列表
    public List<ArticleInfo> grtMyArtList(int uid) throws SQLException {
        List<ArticleInfo> list = new ArrayList<>();
        Connection connection = DBUtils.getConnect();
        String sql = "select * from articleinfo where uid = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,uid);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            ArticleInfo art = new ArticleInfo();
            art.setId(resultSet.getInt("id"));
            art.setContent(resultSet.getString("content"));
            art.setTitle(resultSet.getString("title"));
            art.setRcount(resultSet.getInt("rcount"));
            art.setCreatetime(resultSet.getDate("createtime"));
            art.setUpdatetime(resultSet.getDate("updatetime"));
            art.setState(resultSet.getInt("state"));
            art.setUid(resultSet.getInt("uid"));
            list.add(art);
        }
        DBUtils.close(connection,statement,resultSet);
        return list;
    }

    //删除文章
    public int del(int id) throws SQLException {
        int ret = 0;
        if (id >= 1) {
            //代表参数有效
            Connection connection = DBUtils.getConnect();
            String sql = "delete from articleinfo where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            ret = statement.executeUpdate();
            DBUtils.close(connection,statement,null);
        }
        return ret;
    }

    //根据文章id获取文章的内容
    public ArticleInfo getArtById(int id) throws SQLException {
        ArticleInfo articleInfo = new ArticleInfo();
        if (id >= 1) {
            Connection connection = DBUtils.getConnect();
            String sql = "select * from articleinfo where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                articleInfo.setTitle(resultSet.getString("title"));
                articleInfo.setContent(resultSet.getString("content"));
                articleInfo.setRcount(resultSet.getInt("rcount"));
                articleInfo.setUid(resultSet.getInt("uid"));
                articleInfo.setCreatetime(resultSet.getDate("createtime"));
                articleInfo.setUpdatetime(resultSet.getDate("updatetime"));
                articleInfo.setId(resultSet.getInt("id"));
            }
            DBUtils.close(connection,statement,resultSet);
        }
        return articleInfo;
    }

    //修改文章内容
    public int upArt(String title, String content, int id) throws SQLException {
        int ret = 0;
        if (id >= 1) {
            Connection connection = DBUtils.getConnect();
            String sql = "update articleinfo set title = ?, content = ? where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,title);
            statement.setString(2,content);
            statement.setInt(3,id);
            ret = statement.executeUpdate();
            DBUtils.close(connection,statement,null);
        }
        return ret;
    }

    //添加文章
    public int addArt(String title, String content, int uid) throws SQLException {
        int ret = 0;
        if (title != null && !title.equals("") && content != null && !content.equals("") && uid >= 1) {
            Connection connection = DBUtils.getConnect();
            String sql = "insert into articleinfo(title,content,uid) values (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,title);
            statement.setString(2,content);
            statement.setInt(3,uid);
            ret = statement.executeUpdate();
            DBUtils.close(connection,statement,null);
        }
        return ret;
    }

    //查询所有文章列表，不分页
    public List<ArticleInfoVO> getList() throws SQLException {
        List<ArticleInfoVO> list = new ArrayList<>();
        Connection connection = DBUtils.getConnect();
        String sql = "select a.*,u.username from articleinfo a left join userinfo u on a.uid=u.id";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            ArticleInfoVO articleInfoVO = new ArticleInfoVO();
            articleInfoVO.setId(resultSet.getInt("id"));
            articleInfoVO.setTitle(resultSet.getString("title"));
            articleInfoVO.setCreatetime(resultSet.getDate("createtime"));
            articleInfoVO.setRcount(resultSet.getInt("rcount"));
            articleInfoVO.setUsername(resultSet.getString("username"));
            list.add(articleInfoVO);
        }
        DBUtils.close(connection,statement,resultSet);
        return list;
    }

    //根据分页查询数据
    //cpage代表   psize代表要查询几个数据
    public List<ArticleInfoVO> getListByPage(int cpage, int psize) throws SQLException {
        List<ArticleInfoVO> list = new ArrayList<>();
        Connection connection = DBUtils.getConnect();
        String sql = "select a.*,u.username from articleinfo a left join userinfo u on a.uid=u.id limit ?,?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,(cpage - 1) * psize);
        statement.setInt(2,psize);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            ArticleInfoVO articleInfoVO = new ArticleInfoVO();
            articleInfoVO.setId(resultSet.getInt("id"));
            articleInfoVO.setTitle(resultSet.getString("title"));
            articleInfoVO.setCreatetime(resultSet.getDate("createtime"));
            articleInfoVO.setRcount(resultSet.getInt("rcount"));
            articleInfoVO.setUsername(resultSet.getString("username"));
            list.add(articleInfoVO);
        }
        DBUtils.close(connection,statement,resultSet);
        return list;
    }

    public List<ArticleInfoVO> getDetail(int id) throws SQLException {
        List<ArticleInfoVO> list = new ArrayList<>();
        if (id >= 1) {
            Connection connection = DBUtils.getConnect();
            String sql = "select a.*,u.username from articleinfo a left join userinfo u on a.uid=u.id where a.id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                ArticleInfoVO articleInfoVO = new ArticleInfoVO();
                articleInfoVO.setTitle(resultSet.getString("title"));
                articleInfoVO.setContent(resultSet.getString("content"));
                articleInfoVO.setCreatetime(resultSet.getDate("createtime"));
                articleInfoVO.setRcount(resultSet.getInt("rcount"));
                articleInfoVO.setUsername(resultSet.getString("username"));
                list.add(articleInfoVO);
            }
            DBUtils.close(connection,statement,resultSet);
        }
        return list;
    }

    public int setRcount(int id) throws SQLException {
        int result = 0;
        if (id >= 1) {
            Connection connection = DBUtils.getConnect();
            String sql = "update articleinfo set rcount = rcount+1 where id =?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            result = statement.executeUpdate();
            DBUtils.close(connection,statement,null);
        }
        return result;
    }
}
