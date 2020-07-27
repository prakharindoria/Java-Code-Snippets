import java.sql.*;
import java.util.*;
class MyJdbcApp4StringConcat
{
public static void main(String[] args)
{
Connection conn=null;
try{

	Class.forName("oracle.jdbc.OracleDriver");
	conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-Q82125JL:1521/xe","advjavabatch","admin");
	System.out.println("Connection Successfully opened");
	Scanner kb =new Scanner(System.in);
	System.out.println("Enter BookId");
	int bid=kb.nextInt();
	kb.nextLine();
	System.out.println("Enter Book Name");
	String bname=kb.nextLine();
	System.out.println("Enter Book Subject");
	String sub=kb.nextLine();
	System.out.println("Enter Book Price");
	double price=kb.nextDouble();

	Statement st=conn.createStatement();
	String str="Insert into allbooks values("+bid+",'"+bname+"','"+sub+"',"+price+")";
	System.out.println(str);
	int ans=st.executeUpdate(str);
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


