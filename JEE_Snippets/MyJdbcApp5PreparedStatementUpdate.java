import java.sql.*;
import java.util.*;
class MyJdbcApp5PreparedStatementUpdate
{
public static void main(String[] args)
{
Connection conn=null;
try{

	Class.forName("oracle.jdbc.OracleDriver");
	conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-Q82125JL:1521/xe","advjavabatch","admin");
	System.out.println("Connection Successfully opened");

	Scanner kb =new Scanner(System.in);

	System.out.println("Enter Book Subject");
	String sub=kb.nextLine();

	System.out.println("Enter Book Price Hike");
	double uPrice=kb.nextDouble();


	PreparedStatement ps=conn.prepareStatement("Update allbooks set bookprice=bookprice+? where subject=?");
	ps.setString(2,sub);
	ps.setDouble(1,uPrice);


	int ans=ps.executeUpdate();
	System.out.println("Rec Updated: "+ans);
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


