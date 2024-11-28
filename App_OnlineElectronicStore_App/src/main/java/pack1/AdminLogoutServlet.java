package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/logout")
public class AdminLogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // Get the current session, if it exists, without creating a new session
        HttpSession session = req.getSession(false); // false means do not create a new session

        // If session exists, invalidate it and remove the session attribute
        if (session != null) {
            session.removeAttribute("abean");  // Remove the "abean" attribute from the session
            session.invalidate(); // Invalidate the session
            
            // Redirect the user to the login page after successful logout
            req.getRequestDispatcher("AdminLogin.html").forward(req, res);
        } else {
            // If there is no session, print a parameter (e.g., pcode)
            String pcode = req.getParameter("pcode");
            if (pcode == null) {
                PrintWriter pw = res.getWriter();
                pw.println("Invalid session, pcode: " + pcode);
            }
        }
    }
}
