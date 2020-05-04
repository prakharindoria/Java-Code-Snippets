
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prakhar patidar
 */
public class JdbcConnectionUitEmp {
  
  
    public static void main(String[] args) {
        
try{ 
   Class.forName("oracle.jdbc.driver.OracleDriver");
   System.out.println("Hello");
   Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//Prakhar:1521:xe","system","admin");
    System.out.println("hi");
   JOptionPane.showMessageDialog(null,"Connection done Succesfully");
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery("Select ename,hiredate from uitemp");
   SimpleDateFormat sdf=new SimpleDateFormat();
   while(rs.next()){
   String ename=rs.getString(1);
   Date d=rs.getDate(2);
   String str=sdf.format(d);
       System.out.println(ename+"\t"+str);
   }
   
}
catch(  ClassNotFoundException | SQLException cnfe)
{
JOptionPane.showMessageDialog(null,"Cannot Load Successfully"+cnfe);
cnfe.printStackTrace();
}
}
 
 
    
 
}