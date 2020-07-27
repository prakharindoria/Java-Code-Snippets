package jdbcpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyJdbcAppDateInsert {
	public static void main(String[] args) {
		{
			Connection conn=null;
			try{

				Class.forName("oracle.jdbc.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-Q82125JL:1521/xe","advjavabatch","admin");
				System.out.println("Connection Successfully opened");

				Scanner kb =new Scanner(System.in);
				int count=0;
				String choice;

			    do{
				System.out.println("Enter BookId");
				int bid=kb.nextInt();

				kb.nextLine();
				System.out.println("Enter Book Name");
				String bname=kb.nextLine();

				System.out.println("Enter Book Subject");
				String sub=kb.nextLine();

				System.out.println("Enter Book Price");
				double price=kb.nextDouble();

				PreparedStatement ps=conn.prepareStatement("Insert into allbooks values(?,?,?,?)");
				ps.setInt(1,bid);
				ps.setString(2,bname);
				ps.setDouble(4,price);
				ps.setString(3,sub);

				int ans=ps.executeUpdate();
				System.out.println("Rec Updated: "+ans);
				count+=ans;
				System.out.println("Do You want to continue?");
				choice=kb.next();
			   }while(choice.equalsIgnoreCase("yes"));
			   System.out.println("Total record inserted: "+count);
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
	}}
