package Seance.DAO;

import Utils.DBConnection;
import Seance.Model.Seance;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SeanceDAO {
    public void ajouterSeance(Seance seance) {
        String query = "INSERT INTO Seances (member_id, entraineur_id, dateHeure) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, seance.getMemberId());
            stmt.setInt(2, seance.getEntraineurId());
            stmt.setObject(3, seance.getDateHeure());
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Séance added successfully");
            } else {
                throw new SQLException("No rows affected, insertion failed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to add séance: " + e.getMessage());
        }
    }
}