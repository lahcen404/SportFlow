package Member.Servlet;

import Member.DAO.MemberDAO;
import Member.Model.Member;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/UpdateMember")
public class UpdateMemberServlet extends HttpServlet {
    private MemberDAO memberDAO ;
    @Override
    public void init() throws ServletException {
        memberDAO = new MemberDAO();
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    int id = Integer.parseInt(req.getParameter("id"));
    String username = req.getParameter("username");
    String email = req.getParameter("email");
    String dateNaissance = req.getParameter("dateNaissance");
    String sport =req.getParameter("sport");

        Member member = new Member(id,username,email,dateNaissance,sport);
        boolean isUpdated = memberDAO.updateMember(member);

        if(isUpdated){
            resp.sendRedirect("MemberList");
        } else {
            resp.sendRedirect("MemberList");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }


}
