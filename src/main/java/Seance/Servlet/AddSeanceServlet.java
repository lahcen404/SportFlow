package Entraineur.Servlet;

import Seance.DAO.SeanceDAO;
import Seance.Model.Seance;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/AddSeanceServlet")
public class AddSeanceServlet extends HttpServlet {
    private SeanceDAO seanceDAO;

    @Override
    public void init() throws ServletException {
        seanceDAO = new SeanceDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Optionally forward to addSeance.jsp if accessed via GET
        req.getRequestDispatcher("addSeance.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Security check
        HttpSession session = req.getSession(false);
        if (session == null || session.getAttribute("user") == null || !"admin".equals(session.getAttribute("user"))) {
            resp.sendRedirect("login.jsp");
            return;
        }

        try {
            // Get form parameters
            int memberId = Integer.parseInt(req.getParameter("memberId"));
            int entraineurId = Integer.parseInt(req.getParameter("entraineurId"));
            String dateHeureStr = req.getParameter("dateHeure");
            LocalDateTime dateHeure = LocalDateTime.parse(dateHeureStr); // Format: YYYY-MM-DDTHH:MM

            // Validate inputs
            if (memberId <= 0 || entraineurId <= 0) {
                throw new IllegalArgumentException("Member ID and Trainer ID must be positive.");
            }

            // Create Seance object (ID auto-generated by DB)
            Seance seance = new Seance(0, memberId, entraineurId, dateHeure);
            seanceDAO.ajouterSeance(seance);

            // Redirect on success
            resp.sendRedirect("SeanceServlet");
        } catch (NumberFormatException e) {
            req.setAttribute("errorMessage", "Invalid number format for Member ID or Trainer ID.");
            req.getRequestDispatcher("addSeance.jsp").forward(req, resp);
        } catch (IllegalArgumentException e) {
            req.setAttribute("errorMessage", e.getMessage());
            req.getRequestDispatcher("addSeance.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("errorMessage", "Error adding séance: " + e.getMessage());
            req.getRequestDispatcher("addSeance.jsp").forward(req, resp);
        }
    }
}