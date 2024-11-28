package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteProductServlet extends HttpServlet
{
	              @Override
	            protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	       
	             int deleteProducts = new DeleteProductDAO().deleteProducts(req.getParameter("pcode"));
	             if(deleteProducts == 0) {
	            	 req.setAttribute("msg", "No Products Are not there in the ProductList");
	            	 req.getRequestDispatcher("MSG.jsp").forward(req, res);
	            	 
	             }
	             else {
	            	 req.setAttribute("msg", "Product Deleted");
	            	req.getRequestDispatcher("MSG.jsp").forward(req, res);
	             }
	             
	             
	             
	            }

}
