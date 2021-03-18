import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class TestDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ebook?useSSL=false";
        String name = "root";
        String password = "111111";
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setUrl(url);
        ((MysqlDataSource) dataSource).setUser(name);
        ((MysqlDataSource) dataSource).setPassword(password);
        Connection connection = dataSource.getConnection();

        String sql = "select * from book";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        //将查询到的数据直接打印
        /*while (resultSet.next()) {
            System.out.print(resultSet.getInt(1) + "  ");
            System.out.print(resultSet.getString(2) + "  ");
            System.out.print(resultSet.getString(3) + "  ");
            System.out.print(resultSet.getDouble(4) + "  ");
            System.out.print(resultSet.getInt(5) + "  ");
            System.out.println();
        }*/

        //将查询到的数据封装起来
        while (resultSet.next()) {
            Book book = new Book();
            book.setId(resultSet.getInt(1));
            book.setName(resultSet.getString(2));
            book.setAuthor(resultSet.getString(3));
            book.setPrice(resultSet.getDouble(4));
            book.setCategory_id(resultSet.getInt(5));
            System.out.println(book);
        }
    }
}

