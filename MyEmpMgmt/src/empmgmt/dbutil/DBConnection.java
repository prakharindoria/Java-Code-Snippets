/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    //In this class we will Load Driver in static block.
    private static Connection conn;//As req in more than one places && so that cann be accessed within static block.
    static{//As we only want connection to open once in our application.
        try{
              Class.forName("oracle.jdbc.OracleDriver");
              conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-Q82125JL:1521/xe","advjavabatch","admin"); 
              JOptionPane.showMessageDialog(null,"Connection done successfully!");
           }
        catch(ClassNotFoundException cnfe){
           JOptionPane.showMessageDialog(null,"Cannot load the driver"+cnfe);
           cnfe.printStackTrace();
          }
        catch(SQLException sqlex){
           JOptionPane.showMessageDialog(null,"Problem in DB"+sqlex);
           sqlex.printStackTrace();
        }
    
    }
    
    public static Connection getConnection(){//kyuki Connection static hai
    return conn;
    }
    //Kb static banante hai 1.Jab class me koi data he non static na ho toh 2.Jb koi instance member nhi
    public static void closeConnection(){
          try{
              if(conn!=null){
          conn.close();
          JOptionPane.showMessageDialog(null, "Connection Closed Successfully");
              }
          
          }
          catch(SQLException sqlex){
           JOptionPane.showMessageDialog(null, "Problem in connection"+sqlex);
           sqlex.printStackTrace();
          }
    
    }
}
