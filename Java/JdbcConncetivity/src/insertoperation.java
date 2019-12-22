import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class insertoperation {

	public static void main(String[] args) {
	try
	{
		//choose a database
		Class.forName("com.mysql.jdbc.Driver");
		//create a conncetion   
		//DriverManager.getConnection("java :mysql://localhost:<port where mysql is installed in ur system>/<database name>","username","password");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest","root","fsdfsd");
		 PreparedStatement pst = con.prepareStatement("INSERT INTO users VALUES(1,'farhana',123456)");
		 int result = pst.executeUpdate();
		 if(result>=1)
		 {
		 	   System.out.println("Sucess");
		 }
		 else
		 {
		 	   System.out.println("failed");
		 }
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
	}
}
