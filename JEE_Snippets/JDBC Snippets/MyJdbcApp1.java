import java.sql.*;
class MyJdbcApp1
{
public static void main(String[] args)
{
Connection conn=null;
try{

	Class.forName("oracle.jdbc.OracleDriver");
	conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-Q82125JL:1521/xe","advjavabatch","admin");
	System.out.println("Connection Successfully opened");
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery("Select bookname,bookprice from allbooks");
	while(rs.next())
	{
		String bname=rs.getString(1);
		double amount=rs.getDouble(2);
		System.out.println(bname+"\t\t"+amount);
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
//LAPTOP-Q82125JL


}


}


