import java.sql.*;
class MyJdbcApp2
{
public static void main(String[] args)
{
Connection conn=null;
try{

	Class.forName("oracle.jdbc.OracleDriver");
	conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-Q82125JL:1521/xe","advjavabatch","admin");
	System.out.println("Connection Successfully opened");
	Statement st=conn.createStatement();
	int ans=st.executeUpdate("Insert into allbooks values(106,'Learning Django','Django',500.0)");
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
//LAPTOP-Q82125JL


}


}


