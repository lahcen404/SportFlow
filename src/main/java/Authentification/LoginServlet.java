package Authentification;

import Entraineur.DAO.EntraineurDAO;
import Entraineur.Model.Entraineur;
import Member.DAO.MemberDAO;
import Member.Model.Member;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;



@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

    private MemberDAO memberDAO = new MemberDAO();
    private EntraineurDAO entraineurDAO = new EntraineurDAO();

    @Override
    public void init() throws ServletException {
        super.init();

        memberDAO = new MemberDAO();
        entraineurDAO = new EntraineurDAO();

    }




    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        HttpSession session = req.getSession();


        Member member = memberDAO.loginMember(email,password);
        if (member != null) {
            session.setAttribute("user", member);
            System.out.println("Logiin succes");
            resp.sendRedirect("index.jsp");
            return;
        }




            Entraineur entraineur = entraineurDAO.loginEntraineur(email,password);


        if (entraineur != null) {
        session.setAttribute("user", entraineur);
            System.out.println("Logiin succes");
        resp.sendRedirect("index.jsp");
        return;

    }
        req.setAttribute("errorMessage", "Invalid email or password!");
        req.getRequestDispatcher("login.jsp").forward(req, resp);

    }


}
