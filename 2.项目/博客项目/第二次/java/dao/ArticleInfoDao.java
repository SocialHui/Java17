package dao;

import models.ArticleInfo;
import models.vo.ArticleInfoVO;
import utils.DBUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArticleInfoDao {
    //获取文章列表
    public List<ArticleInfo> getMyArtList(int uid) throws SQLException {
        List<ArticleInfo> list = new ArrayList<>();
        Connection connection = DBUtils.getConnect();
        String sql = "select * from articleinfo where uid = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,uid);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            ArticleInfo articleInfo = new ArticleInfo();
            articleInfo.setId(resultSet.getInt("id"));
            articleInfo.setTitle(resultSet.getString("title"));
            articleInfo.setCreatetime(resultSet.getDate("createtime"));
            articleInfo.setContent(resultSet.getString("content"));
            articleInfo.setUpdatetime(resultSet.getDate("updatetime"));
            articleInfo.setRcount(resultSet.getInt("rcount"));
            list.add(articleInfo);
        }
        //关闭
        DBUtils.close(connection,statement,resultSet);
        return list;
    }

    //文章删除
    public int delArtileById(int id) throws SQLException {
        int result = 0;
        Connection connection = DBUtils.getConnect();
        String sql = "delete from articleinfo where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        result = statement.executeUpdate();
        DBUtils.close(connection,statement,null);
        return result;
    }


    //文章添加
    public int add(String title, String content, int uid) throws SQLException {
        int result = -1;
        Connection connection = DBUtils.getConnect();
        String sql = "insert into articleinfo(title,content,uid) values (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,title);
        statement.setString(2,content);
        statement.setInt(3,uid);

        result = statement.executeUpdate();
        DBUtils.close(connection,statement,null);
        return result;
    }


    //文章修改
    public int upArt(String title, String content, int id) throws SQLException {
        int result = 0;

        Connection connection = DBUtils.getConnect();
        String sql = "update articleinfo set title = ?, content = ? where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,title);
        statement.setString(2,content);
        statement.setInt(3,id);
        result = statement.executeUpdate();
        DBUtils.close(connection,statement,null);
        return result;
    }

    //得到某个人文章
    public ArticleInfo getMyAry(int id) throws SQLException {
        ArticleInfo articleInfo = new ArticleInfo();
        Connection connection = DBUtils.getConnect();
        String sql = "select * from articleinfo where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            articleInfo.setTitle(resultSet.getString("title"));
            articleInfo.setContent(resultSet.getString("content"));
        }
        DBUtils.close(connection,statement,resultSet);
        return articleInfo;
    }

    //查找展示所有的文章列表
    public List<ArticleInfoVO> getList() throws SQLException {
        List<ArticleInfoVO> list = new ArrayList<>();

        Connection connection = DBUtils.getConnect();
        String sql = "select a.*,u.username from articleinfo a left join userinfo u on a.uid=u.id";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            ArticleInfoVO vo = new ArticleInfoVO();
            vo.setId(resultSet.getInt("id"));
            vo.setUsername(resultSet.getString("username"));
            vo.setTitle(resultSet.getString("title"));
            vo.setRcount(resultSet.getInt("rcount"));
            vo.setCreatetime(resultSet.getDate("createtime"));
            list.add(vo);
        }
        DBUtils.close(connection,statement,resultSet);
        return list;
    }


    //分页查找文章列表
    public List<ArticleInfoVO> getListByPage(int cpage, int psize) throws SQLException {
        List<ArticleInfoVO> list = new ArrayList<>();

        Connection connection = DBUtils.getConnect();
        String sql = "select a.*,u.username from articleinfo a left join userinfo u on a.uid=u.id limit ?,?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,(cpage-1)*psize);
        statement.setInt(2,psize);

        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            ArticleInfoVO vo = new ArticleInfoVO();
            vo.setId(resultSet.getInt("id"));
            vo.setUsername(resultSet.getString("username"));
            vo.setTitle(resultSet.getString("title"));
            vo.setRcount(resultSet.getInt("rcount"));
            vo.setCreatetime(resultSet.getDate("createtime"));
            list.add(vo);
        }
        DBUtils.close(connection,statement,resultSet);
        return list;
    }

    //文章详情耶
    public ArticleInfoVO getDetailArtById(int id) throws SQLException {
        ArticleInfoVO articleInfoVO = new ArticleInfoVO();
        if (id >= 1) {
            Connection connection = DBUtils.getConnect();
            String sql = "select a.*,u.username from articleinfo a left join userinfo u on a.uid=u.id where a.id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                articleInfoVO.setUsername(resultSet.getString("username"));
                articleInfoVO.setRcount(resultSet.getInt("rcount"));
                articleInfoVO.setCreatetime(resultSet.getDate("createtime"));
                articleInfoVO.setContent(resultSet.getString("content"));
                articleInfoVO.setTitle(resultSet.getString("title"));
            }
            DBUtils.close(connection,statement,resultSet);
        }
        return articleInfoVO;
    }

    public int getRcountById(int id) throws SQLException {
        int ret = 0;
        if (id >= 1) {
            Connection connection = DBUtils.getConnect();
            String sql = "update articleinfo set rcount = rcount+1 where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            ret = statement.executeUpdate();
            DBUtils.close(connection,statement,null);
        }
        return ret;
    }
}










