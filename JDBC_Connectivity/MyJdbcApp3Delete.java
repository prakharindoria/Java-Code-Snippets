import java.sql.*;
class MyJdbcApp3Delete
{
public static void main(String[] args)
{
Connection conn=null;
try{

	Class.forName("oracle.jdbc.OracleDriver");
	conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-Q82125JL:1521/xe","advjavabatch","admin");
	System.out.println("Connection Successfully opened");
	Statement st=conn.createStatement();
	int ans=st.executeUpdate("delete from allbooks where bookprice >=600 and bookprice <=700");
	System.out.println("Rec Inserted"+ans);
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


