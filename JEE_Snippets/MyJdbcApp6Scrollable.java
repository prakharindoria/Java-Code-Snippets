import java.sql.*;
class MyJdbcApp6Scrollable
{
public static void main(String[] args)
{
Connection conn=null;
try{

	Class.forName("oracle.jdbc.OracleDriver");
	conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-Q82125JL:1521/xe","advjavabatch","admin");
	System.out.println("Connection Successfully opened");
	Statement st=conn.createStatement(ResultSet.TYPE_SCROL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	ResultSet rs=st.executeQuery("Select subject,bookprice from allbooks");

	while(rs.next())
	{
		String str=rs.getString(2);
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


