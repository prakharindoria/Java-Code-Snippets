/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author prakhar patidar
 */
public class DisplayServlet extends HttpServlet {

    private Connection conn=null;
    PreparedStatement ps;

    public void init() throws ServletException {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver Loaded SucessFully!!!!");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-Q82125JL:1521/xe", "advjavabatch", "admin");
            System.out.println("Connection open Sucessfully!!!!");
            ps = conn.prepareStatement("select bookname,bookprice from allbooks where subject=?");
        } catch (Exception ex) {
            System.out.println("Problem in init!!!" + ex);
            ServletException se = new ServletException();
            throw se;
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        RequestDispatcher rd = null;
        List<Book> booklist = new ArrayList<>();
        
        try (PrintWriter out = response.getWriter()) {
            String sub = request.getParameter("bname");

            if (sub.isEmpty()) {
                rd=request.getRequestDispatcher("index.html");
               out.println("<h2 style=color:red;>Please Input Book Name.</h2><br>");
                rd.include(request, response);
            } else {
                try {
                    rd = request.getRequestDispatcher("DisplayResultServlet");

                    
                    try {

                        ps.setString(1, sub);
                        ResultSet rs = ps.executeQuery();

                        while (rs.next()) {
                            String bn = rs.getString("bookname");
                            double amount = rs.getDouble("bookprice");
                            Book obj = new Book(bn, amount);
                            booklist.add(obj);

                        }
                        request.setAttribute("booklist", booklist);
                        rd.forward(request, response);
                    } catch (Exception e) {
                        System.out.println("Sorry Cannot Connect To Database");
                        e.printStackTrace();
                    }

                } catch (NumberFormatException nfe) {
                    rd = request.getRequestDispatcher("index.html");
                    out.println("<span style=color:red;>Please input vaild name</span>");
                    rd.include(request, response);
                }
            }

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
