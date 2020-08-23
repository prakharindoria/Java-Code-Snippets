import javax.servlet.*;
import java.io.*;

public class MyFirstServlet extends GenericServlet {
public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
res.setContentType("text/html");
PrintWriter pw =res.getWriter();
pw.println("<html>");
pw.println("<head>");
pw.println("<title>MyFirstServlet</title>");
pw.println("</head>");
pw.println("<body>");
pw.println("<h1>Welcome to My First Servlet</h1>");
pw.println("<a href=index.html>Click Me To Go To HTML</a>");
pw.println("</body>");
pw.println("</html>");


}


}