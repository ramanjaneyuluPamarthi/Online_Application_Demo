package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDAO {
	public int insertProduct(ProductBean pb) {
		int rowCount = 0;
		try {
			Connection con = DBConnect.getCon();
			PreparedStatement pstm = con.prepareStatement("insert into product values(?,?,?,?,?)");
			pstm.setString(1, pb.getPcode());
			pstm.setString(2, pb.getPname());
			pstm.setString(3, pb.getPcompany());
			pstm.setString(4, pb.getPprice());
			pstm.setString(5,pb.getPqty());
		    rowCount = pstm.executeUpdate();
			
			
		}
		catch(Exception e) {
			
		}
		return rowCount;
	}

}
