package Member.Servlet;

import Member.DAO.MemberDAO;
import Member.Model.Member;
import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
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

//        HttpSession session = request.getSession(false);
//        if (session == null || session.getAttribute("user") == null || !"admin".equals(session.getAttribute("user"))) {
//            response.sendRedirect("login.jsp");
//            return;
//        }

        try {
            MemberDAO memberDAO = new MemberDAO();
            List<Member> members = memberDAO.getAllMembers();
            System.out.println(members);

            RequestDispatcher dispatcher = request.getRequestDispatcher("manageMembers.jsp");
            request.setAttribute("members", members);
            dispatcher.forward(request, response);


        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Error fetching members: " + e.getMessage());
        }


    }
}