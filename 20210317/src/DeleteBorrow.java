import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class DeleteBorrow {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://localhost:3306/ebook?useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("111111");
        Connection connection = dataSource.getConnection();

        String sql = "delete from borrow_info where id = (select r.id from (select max(id) id from borrow_info) r)";
        //String sql = "delete from borrow_info where id = max(id)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        int n = preparedStatement.executeUpdate();
        if (n!= 0) {
            System.out.println("删除成功");
        }
    }
}
