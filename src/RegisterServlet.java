import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet("/register.jsp")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp){

        /**
         * 接收前台传来的值
         */
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String userSex = req.getParameter("userSex");
        String userEmail = req.getParameter("userEmail");


        DBUtil dbUtil = new DBUtil();
        User user = new User(userName,password,userSex,userEmail);//数据打包成用户
        DAO dao = new DAO();//生产操作员dao
        try {
            //数据库连接
            Connection con = dbUtil.getCon();
            String info = "";
            if (dao.register(con,user)){//dao为用户注册
                info = "注册成功！";
            }else{
                info = "注册失败...";
            }
            req.setAttribute("outputMessage",info);
            req.getRequestDispatcher("/info.jsp").forward(req,resp);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
