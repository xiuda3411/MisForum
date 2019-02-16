import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        this.doGet(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        DBUtil dbUtil = new DBUtil();
        User user = new User(userName,password);
        DAO dao = new DAO();
        String info = "";
        try {
            Connection con = dbUtil.getCon();
            if (dao.login(con,user)!=null){
                info = userName+",欢迎你！";
            }else {
                info = "用户名或密码不正确！";
            }
            req.setAttribute("outputMessage",info);
            req.getRequestDispatcher("/info.jsp").forward(req,resp);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
