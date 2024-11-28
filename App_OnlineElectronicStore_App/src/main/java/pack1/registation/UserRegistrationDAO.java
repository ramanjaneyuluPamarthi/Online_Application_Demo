package pack1.registation;

import java.sql.Connection;
import java.sql.PreparedStatement;

import pack1.DBConnect;

public class UserRegistrationDAO {
			int rowcount=0;
	
		 // UserRegistrationBean ubean= new UserRegistrationBean();
		  
		  
		  public int register(UserRegistrationBean ub) {
			  try {
				  
				  Connection con= DBConnect.getCon();
				   PreparedStatement pstm = con.prepareStatement("insert into customer values(?,?,?)");
				   pstm.setString(1, ub.getName());
				   pstm.setString(2, ub.getPwd());
				   pstm.setString(3,ub.getMobile());
				   rowcount = pstm.executeUpdate();
				  
			  }
			catch (Exception e) {
					e.printStackTrace();				}	
			

			   
			  
			  return rowcount;
		  }
		  
	
}
