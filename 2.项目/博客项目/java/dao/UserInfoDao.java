package dao;

import models.UserInfo;
import utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class UserInfoDao {
    /**
     * 注册
     */
    public boolean add(UserInfo userInfo) throws SQLException {
        //获取连接
        boolean result = false;
        if (userInfo.getUsername() != null && userInfo.getPassword() != null) {
            Connection connection = DBUtils.getConnect();
            String sql = "insert into userinfo(username,passwors) values(?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,userInfo.getUsername());
            statement.setString(2,userInfo.getPassword());
            result = statement.executeUpdate() >= 1 ? true : false;
            DBUtils.close(connection,statement,null);
        }
        return result;
    }

    /**
     * 登录
     * @param userInfo
     * @return
     * @throws SQLException
     */
    public boolean isLogin(UserInfo userInfo) throws SQLException {
        boolean result = false;
        if (userInfo.getUsername() != null && userInfo.getPassword() != null
                && !userInfo.getUsername().equals("") && !userInfo.getPassword().equals("")) {
            Connection connection = DBUtils.getConnect();
            String sql = "select * from userinfo where username=?" +
                    "and passwors=? and state=1";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,userInfo.getUsername());
            statement.setString(2,userInfo.getPassword());
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                result = true;
            }
        }
        return result;
    }


    //获取用户信息
    //在添加文章和的获取我的文章列表的时候需要用到
    public UserInfo getUserInfo(UserInfo userInfo) throws SQLException {
        UserInfo user = new UserInfo();
        Connection connection = DBUtils.getConnect();
        String sql = "select * from userinfo where username = ? and passwors = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,userInfo.getUsername());
        statement.setString(2,userInfo.getPassword());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("passwors"));
            user.setCreatetime(resultSet.getDate("createtime"));
            user.setId(resultSet.getInt("id"));
            user.setState(resultSet.getInt("state"));
            user.setUpdatetime(resultSet.getDate("updatetime"));
        }
        DBUtils.close(connection,statement,resultSet);
        return user;
    }
}
