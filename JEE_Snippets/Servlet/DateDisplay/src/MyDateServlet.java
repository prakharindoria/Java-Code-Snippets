import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class MyDateServlet extends HttpServlet {
protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
res.setContentType("text/html");
PrintWriter pw =res.getWriter();
pw.println("<html>");
pw.println("<head>");
pw.println("<title>MyFirstServlet</title>");
pw.println("</head>");
pw.println("<body>");
java.util.Date now = new java.util.Date();
java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
String str=sdf.format(now);
pw.println("<h1>Welcome to My First Servlet</h1>");
pw.println("<h1>Date is"+str+"</h1>");
pw.println("<a href=index.html>Click Me To Go To HTML</a>");
pw.println("</body>");
pw.println("</html>");


}


}