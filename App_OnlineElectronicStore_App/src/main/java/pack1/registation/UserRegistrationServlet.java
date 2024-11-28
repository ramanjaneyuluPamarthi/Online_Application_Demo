package pack1.registation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/rls")
public class UserRegistrationServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name= req.getParameter("name");
		String pwd = req.getParameter("pwd");
		String mobile= req.getParameter("mobile");
		
		UserRegistrationBean ub = new UserRegistrationBean();
		
		ub.setName(name);
		ub.setPwd(pwd);
		ub.setMobile(mobile);
		
		int rowcount=new UserRegistrationDAO().register(ub);
		if(rowcount>0) {
			req.setAttribute("msg", "User Registration Successful");
			req.getRequestDispatcher("Registration.jsp").forward(req, resp);
		}
		else {
			req.getRequestDispatcher("Registration.html").forward(req, resp);
		}
		
	}

}
