package dao;

import models.UserINfo;
import utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfoDao {
    //注册插入数据库
    public boolean add(UserINfo userINfo) throws SQLException {
        boolean result = false;
        if (userINfo.getUsername() != null && userINfo.getPassword() != null) {
            //正常的参数
            Connection connection = DBUtils.getConnect();
            String sql = "insert into userinfo(username,password) values(?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,userINfo.getUsername());
            statement.setString(2,userINfo.getPassword());
            result = statement.executeUpdate() >= 1 ? true : false;
            DBUtils.close(connection,statement,null);
        }
        return result;
    }

    //登录在数据库中查找是否有这个用户
    public boolean isLogin(UserINfo userINfo) throws SQLException {
        boolean result = false;
        if (userINfo.getUsername() != null && userINfo.getPassword() != null && !userINfo.getUsername().equals("") && !userINfo.getPassword().equals("")) {
            Connection connection = DBUtils.getConnect();
            String sql = "select * from userinfo where username = ? and password = ? and state = 1";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,userINfo.getUsername());
            statement.setString(2,userINfo.getPassword());
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                result = true;
            }
            DBUtils.close(connection,statement,resultSet);
        }
        return result;
    }

    //获取userINfo对象
    public UserINfo getUserInfo(UserINfo userINfo) throws SQLException {
        UserINfo user = new UserINfo();
        Connection connection = DBUtils.getConnect();
        String sql = "select * from userinfo where username = ? and password = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,userINfo.getUsername());
        statement.setString(2,userINfo.getPassword());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            user.setId(resultSet.getInt("id"));
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
        }
        DBUtils.close(connection,statement,resultSet);
        return user;
    }
}
