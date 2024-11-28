package pack1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/aps")
public class AddProductServlet extends HttpServlet {
	
	  	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  		HttpSession session = req.getSession(false);   //checking whether the session is available or not
		if(session==null) {
			req.setAttribute("msg", "Session Expired!!!");
			req.getRequestDispatcher("AdminLogin.html").forward(req, res);
			
		}
		else {
			ProductBean pbean = new ProductBean();
			pbean.setPcode(req.getParameter("pcode"));
			pbean.setPname(req.getParameter("pname"));
			pbean.setPcompany(req.getParameter("pcompany"));
			pbean.setPprice(req.getParameter("pprice"));
			pbean.setPqty(req.getParameter("pqty"));
			
			int rowCount = new AddProductDAO().insertProduct(pbean);
			if(rowCount>0) {
				req.setAttribute("msg", "Product Added Successfully");
				req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
				
			}
			else {
				System.out.println("Data not Inserted");
				req.getRequestDispatcher("AdminLogin.html");
			}
		}
	  		
	}

}
