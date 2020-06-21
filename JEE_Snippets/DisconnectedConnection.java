/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcPrac;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author prakhar patidar
 */
public class DisconnectedConnection {
    public static void main(String[] args) {
       try{
           
           Class.forName("oracle.jdbc.OracleDriver");
           System.out.println("Driver Loaded Successfully");
           CachedRowSetImpl obj=new CachedRowSetImpl();
           obj.setUrl("jdbc:oracle:thin:@//LAPTOP-Q82125JL:1521/xe");
           obj.setUsername("advjavabatch");
           obj.setPassword("admin");
           obj.setCommand("Select bookname,bookprice from allbooks");
           obj.execute();
           while(obj.next())
           {
           String bname=obj.getString(1);
           double bookprice=obj.getDouble(2);
           System.out.println(bname+"\t"+bookprice);
           }
          }
        catch(SQLException sqle)
        { 
            System.out.println("Sorry Cannot Connect To Database");
            sqle.printStackTrace();
        }
        catch(ClassNotFoundException cnfe)
        {
            cnfe.printStackTrace();
            System.out.println("Sorry Cannot Connect To Driver");
        }
              
    }
    
}
