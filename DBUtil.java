package Utility;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public DBUtil() {}
	// TODO Auto-generated constructor stub
	public static Connection getConnection() {
		Connection con=null;
				try
		{
					Class.forName("com.mysql.cj.jdbc.Driver");  
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Christ@2003");
		}	
				catch(Exception e)
				{
					System.out.println(e);
				}
				return con;
		// TODO Auto-generated constructor stub
	}

}
