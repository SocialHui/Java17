import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class QueryBorrow {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://localhost:3306/ebook?useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("111111");
        Connection connection = dataSource.getConnection();

        String sql = "select borrow_info.* from borrow_info inner join book on book.category_id = (select id from category where name = ?) and book.id = borrow_info.book_id";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,"计算机");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.print(resultSet.getInt(1) + " ");
            System.out.print(resultSet.getInt(2) + " ");
            System.out.print(resultSet.getInt(3) + " ");
            System.out.print(resultSet.getTimestamp(4) + " ");
            System.out.print(resultSet.getTimestamp(5) + " ");
            System.out.println();
        }
    }
}
