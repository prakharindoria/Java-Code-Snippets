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
	Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("Select subject,bookprice from allbooks");
	int count=0;

	while(rs.next())
	{
		String str=rs.getString(1);
		if(str.equalsIgnoreCase("C"))
		{
		double amt=rs.getDouble(2);
		amt=amt+amt*0.1;
		rs.updateDouble(2,amt);
		count++;
		rs.updateRow();
	}
	


	}
        if(count>0)
		{System.out.println("Books Updated: "+count);}
	else 
		{System.out.println("Sorry No Books");}
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


