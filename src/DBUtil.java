import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static String DBUrl = "jdbc:mysql://localhost:3306/MisForum?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
    private static String DBUserName = "root";
    private static String DBPassword = "";
    private static String jdbcName = "com.mysql.cj.jdbc.Driver";

    /**
     * 获取数据库连接
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Connection getCon() throws ClassNotFoundException, SQLException {
        Class.forName(jdbcName);
        Connection con = DriverManager.getConnection(DBUrl,DBUserName,DBPassword);
        return con;
    }

    /**
     * 关闭数据库连接
     * @param con
     * @throws SQLException
     */
    public void closeCon(Connection con) throws SQLException {
        if(con!=null){
            con.close();
        }
    }

    /**
     * 检测数据库连接是否成功
     * @param args
     */
    public static void main(String[] args) {
        DBUtil dbUtil = new DBUtil();
        try {
            dbUtil.getCon();
            System.out.println("数据库连接成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
