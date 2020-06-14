package jdbcpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ImgInsert {
	public static void main(String[] args) {
		{
			Connection conn=null;
			try{

				Class.forName("oracle.jdbc.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-Q82125JL:1521/xe","advjavabatch","admin");
				System.out.println("Connection Successfully opened");
				
				PreparedStatement ps=conn.prepareStatement("insert into movie values(?,?)");

				Scanner kb =new Scanner(System.in);
			    System.out.println("Enter path of image");
			    String str=kb.nextLine();
			    File f=new File(str);
			    FileInputStream fin=new FileInputStream(str);
			    String fname=f.getName();
			    int dotpos=fname.lastIndexOf(".");
			    String movname=fname.substring(0,dotpos);
			    
			    ps.setString(1, movname);
			    ps.setBinaryStream(2, fin,(int)f.length());
			    
			    int res=ps.executeUpdate();
			    System.out.println("Rec Inserted"+res);
				
			}
			catch(FileNotFoundException fnfe)
			{ 
				System.out.println("Sorry Cannot Connect To Database");
				fnfe.printStackTrace();
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
			finally{
				if(conn != null)
					try{
			   		conn.close();
			   	 		}
			   	 	catch(SQLException sqle)
					{ 
								System.out.println("Sorry Cannot Connect To Database");
								sqle.printStackTrace();
					}

			}

}
	}

}
