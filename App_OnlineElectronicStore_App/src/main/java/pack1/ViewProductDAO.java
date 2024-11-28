package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewProductDAO {
	ArrayList <ProductBean> al = new ArrayList<ProductBean>();
	public ArrayList<ProductBean> reteriveProduct(){
		try {
			Connection con = DBConnect.getCon();
			PreparedStatement pstm = con.prepareStatement("select * from product");
			ResultSet rs= pstm.executeQuery();
			while(rs.next()) {
				ProductBean pbean = new ProductBean();
				pbean.setPcode(rs.getString(1));
				pbean.setPname(rs.getString(2));
				pbean.setPcompany(rs.getString(3));
				pbean.setPprice(rs.getString(4));
				pbean.setPqty(rs.getString(5));
				al.add(pbean);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return al;
	}

}
