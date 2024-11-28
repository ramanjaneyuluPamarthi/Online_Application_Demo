package pack1.registation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pack1.DBConnect;

public class UserLoginDAO 
{
	public void login(String Username,String Password) {
		Connection con = DBConnect.getCon();
		try {
			PreparedStatement pstm = con.prepareStatement("select * from customer where UNAME=? and PWORD=?");
			pstm.setString(1,Username );
			pstm.setString(2,Password);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()) {
				UserRegistrationBean ub = new UserRegistrationBean();
				ub.setName(rs.getString(1));
				ub.setPwd(rs.getString(2));
				ub.setMobile(rs.getString(3));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
