import com.mysql.jdbc.Util;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AddBorrow {
    //日期字符串转Java日期类Date和sql时间戳Timestamp
    public static Timestamp getTimestamp(String dateString){
        try {
            // 年-月-日 小时:分钟:秒
            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
            return new java.sql.Timestamp(date.getTime());
        } catch (ParseException e) {
            throw new RuntimeException("日期格式化错误："+dateString, e);
        }
    }
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://localhost:3306/ebook?useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("111111");
        Connection connection = dataSource.getConnection();

        //String sql1 = "insert into borrow_info(book_id, student_id,start_time, end_time) select b.id,s.id,?,? from book b,student s where b.name=? and s.name=?";
        String sql = "insert into borrow_info(book_id, student_id, start_time, end_time) values ((select id from book where name = ?), (select id from student where name = ?),?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"诗经");
        preparedStatement.setString(2,"貂蝉");
        preparedStatement.setTime(3, Util.getTimestamp("2019-09-25 17:50:00"));
        preparedStatement.setTime(4, Util.getTimestamp("2019-09-25 17:50:00"));

        int n = preparedStatement.executeUpdate();
        if (n != 0) {
            System.out.println("插入成功");
        }
    }
}
