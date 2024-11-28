package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteProductDAO {
	
	public int deleteProducts(String pcode){
		int rowCount=0;
		try {
			Connection con = DBConnect.getCon();
			PreparedStatement pstm = con.prepareStatement("delete from product where pcode=?");
			pstm.setString(1, pcode);
			int  Count = pstm.executeUpdate();
			if(Count>0) {
				rowCount=1;
			}
			else {
				rowCount = 0;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return rowCount;
	}

}
