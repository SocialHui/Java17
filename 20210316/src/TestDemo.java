import java.sql.*;

public class TestDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接
        String url = "jdbc:mysql://localhost:3306/system?useSSL=false";
        String name = "root";
        String password = "111111";
        Connection connection = DriverManager.getConnection(url,name,password);

        //执行
        String str = "select * from salary";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(str);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getInt(2));
            System.out.println(resultSet.getInt(3));
            System.out.println(resultSet.getTime(4));
        }
    }
}
