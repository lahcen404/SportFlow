package Entraineur.Servlet;

import Entraineur.DAO.EntraineurDAO;
import Entraineur.Model.Entraineur;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/EntraineurServlet")
public class EntraineurServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            EntraineurDAO entraineurDAO = new EntraineurDAO();
            List<Entraineur> entraineurs = entraineurDAO.getAllEntraineurs();
            System.out.println(entraineurs);

            RequestDispatcher dispatcher = req.getRequestDispatcher("manageEntraineurs.jsp");
            req.setAttribute("entraineurs", entraineurs);
            dispatcher.forward(req, resp);


        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("errorMessage", "Error fetching members: " + e.getMessage());
        }
    }
}
