import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    /**
     * login(Connection con,User user)登录
     * 在数据库中查找对应账号密码的用户，有则返回null，没有则返回输入的用户
     * @param con
     * @param user
     * @return
     * @throws SQLException
     */
    public User login(Connection con,User user) throws SQLException {
        User resultUser = null;
        String sql = "select * from user where userName=? and password=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1,user.getUserName());
        pstmt.setString(2,user.getPassword());
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()){
            resultUser = new User();
            resultUser.setUserName(rs.getString("userName"));
            resultUser.setPassword(rs.getString("password"));
        }
        return resultUser;
    }

    /**
     * register(Connection con,User user)注册
     * 成功返回true，失败返回false
     * @param con
     * @param user
     * @return
     * @throws SQLException
     */
    public boolean register(Connection con,User user) throws SQLException {
        boolean flag = false;
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO user(userName,password,userSex,userEmail)VALUES(?,?,?,?)";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1,user.getUserName());
        pstmt.setString(2,user.getPassword());
        pstmt.setString(3,user.getUserSex());
        pstmt.setString(4,user.getUserEmail());
        if(pstmt.executeUpdate()>0){
            flag = true;
        }
        return flag;
    }
}
