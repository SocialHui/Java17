import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;
public class UpdateBook {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://localhost:3306/ebook?useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("111111");
        Connection connection = dataSource.getConnection();

        String sql = "update book set price = ? where name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setDouble(1,61.2);
        preparedStatement.setString(2,"深入理解Java虚拟机");

        int n = preparedStatement.executeUpdate();
        if (n != 0) {
            System.out.println("更新成功");
        }
    }
}
