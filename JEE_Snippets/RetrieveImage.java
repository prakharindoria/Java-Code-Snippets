package jdbcpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.sql.BLOB;

public class RetrieveImage {
	public static void main(String[] args) {
		{
			Connection conn=null;
			try{

				Class.forName("oracle.jdbc.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-Q82125JL:1521/xe","advjavabatch","admin");
				System.out.println("Connection Successfully opened");
				
				Statement st=conn.createStatement();
				ResultSet rs=st.executeQuery("select * from movie");
				File myfolder=new File("E:\\mycpypics");
				myfolder.mkdir();
				while(rs.next()) {
				String mname=rs.getString(1);
				Blob obj=rs.getBlob(2);
				byte []arr=obj.getBytes(1,(int)obj.length());
				String img=myfolder.getAbsolutePath()+"\\"+mname+".jpg";
				System.out.println("Stored :"+img);
				FileOutputStream fout=new FileOutputStream(img);
				fout.write(arr);
				fout.close();
				
				}
				
			}
			catch(IOException ioex)
			{ 
				System.out.println("Sorry Cannot Connect To Database");
				ioex.printStackTrace();
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
