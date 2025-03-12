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

import java.io.IOException;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        MemberDAO memberDAO = new MemberDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String role = req.getParameter("role");

if(role.equals("member")){
    String username = req.getParameter("username");
    String email = req.getParameter("email");
    String password = req.getParameter("password");
    String dateNaissance = req.getParameter("dateNaissance");
    String sport =req.getParameter("sport");

    Member member =new Member(username,email,password,dateNaissance,sport);
    MemberDAO memberDAO = new MemberDAO();

    memberDAO.ajouterMember(member);

}else if(role.equals("entraineur")){

    String username = req.getParameter("username");
    String email = req.getParameter("email");
    String password = req.getParameter("password");
    String specialite = req.getParameter("specialite");


    Entraineur entraineur =new Entraineur(username,email,password,specialite);
    EntraineurDAO entraineurDAO = new EntraineurDAO();

    entraineurDAO.ajouterEntraineur(entraineur);
}


    }


}
