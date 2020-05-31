import java.sql.*;
class ConnectionToOracleDB{
public static void main(String[] args){
Connection conn=null;//Creating Connection ref and assigning NULL
	try
	{
	    	Class.forName("oracle.jdbc.OracleDriver");
	    	conn=DriverManager.getConnection("jdbc:oracle:thin:@//Computer_Name:1521/xe","UserID","Password");
	    	System.out.println("Connection Successfully opened");
	    	Statement st=conn.createStatement();
	    	ResultSet rs=st.executeQuery("Select bookname,bookprice from allbooks");
	while(rs.next())
			{
				String bookname=rs.getString(1);
				double amount=rs.getDouble(2);
				System.out.println(bookname+"\t\t"+amount);
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
finally
	{
	if(conn != null)
		try
		{
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


