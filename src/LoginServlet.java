import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet("/login.jsp")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        DBUtil dbUtil = new DBUtil();
        User user = new User(userName,password);
        DAO dao = new DAO();
        String user_name = userName;
        String info = "";
        try {
            Connection con = dbUtil.getCon();
            if (dao.login(con,user)!=null){
                info = userName+",欢迎登录！";
                Cookie name = new Cookie("userName",userName);
                name.setMaxAge(24*60*60);
                resp.addCookie(name);
                HttpSession session = req.getSession();
                session.setAttribute("user_name",userName);
                String sessionID = session.getId();
                if (session.isNew()){
                    resp.getWriter().print("session创建成功，session的ID是:"+sessionID);
                }else {
                    resp.getWriter().print("服务器已存在该session，session的ID是:"+sessionID);
                }
                resp.sendRedirect("homepage.jsp");
                return;
            }else {
                info = "用户名或密码不正确！";
                user_name = null;
            }
            req.setAttribute("outputMessage",info);
            req.setAttribute("user_name",user_name);
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
