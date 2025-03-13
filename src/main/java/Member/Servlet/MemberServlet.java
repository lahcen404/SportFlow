package Member.Servlet;

import Member.DAO.MemberDAO;
import Member.Model.Member;
import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Security check
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("user") == null || !"admin".equals(session.getAttribute("user"))) {
            response.sendRedirect("login.jsp");
            return;
        }

        try {
            // Initialize DAO and fetch members
            MemberDAO memberDAO = new MemberDAO();
            List<Member> members = memberDAO.getAllMembers();

            // Debugging: Log to console
            System.out.println("Members fetched: " + (members != null ? members.size() : "null"));
            if (members != null) {
                for (Member m : members) {
                    System.out.println("Member: " + m.getId() + ", " + m.getUserame());
                }
            }

            // Set attributes
            request.setAttribute("members", members);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Error fetching members: " + e.getMessage());
        }

        // Forward to JSP
        request.getRequestDispatcher("manageMembers.jsp").forward(request, response);
    }
}