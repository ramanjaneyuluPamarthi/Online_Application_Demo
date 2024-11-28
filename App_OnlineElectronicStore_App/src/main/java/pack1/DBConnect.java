package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import static pack1.DBInfo.*;

public class DBConnect 
{
	private static Connection con = null;
	
	private DBConnect() {}
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(DBurl,DBUname,DBUpwd);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon() {
		return con;
	}

}
