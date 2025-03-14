package Entraineur.DAO;

import Entraineur.Model.Entraineur;
import Member.Model.Member;
import Utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static Utils.DBConnection.getConnection;

public class EntraineurDAO {

    public void  ajouterEntraineur(Entraineur entraineur) {

        try (Connection con = DBConnection.getConnection()) {

            String query = "insert into Entraineurs(username,email,password,specialite) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, entraineur.getUserame());
            ps.setString(2, entraineur.getEmail());
            ps.setString(3, entraineur.getPassword());
            ps.setString(4, entraineur.getSpecialite());

            ps.executeUpdate();

        }catch(SQLException e) {
            e.printStackTrace();
        }

    }
    public Entraineur loginEntraineur(String email, String password) {

        Entraineur entraineur = null;
        try(Connection con = DBConnection.getConnection()){
            String query = "SELECT * FROM Entraineurs WHERE email=? AND password=?";
            PreparedStatement stmnt = con.prepareStatement(query);
            stmnt.setString(1, email);
            stmnt.setString(2, password);
            ResultSet rs = stmnt.executeQuery();

            if(rs.next()) {
                entraineur = new Entraineur();
                entraineur.setId(rs.getInt("id"));
                entraineur.setUserame(rs.getString("username"));
            }

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return entraineur;
    }

    public List<Entraineur> getAllEntraineurs() {
        List<Entraineur> entraineurs = new ArrayList<>();
        String query = "SELECT * FROM entraineurs";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String specialite = rs.getString("specialite");

                entraineurs.add(new Entraineur(id, username, email, null,  specialite)); // Password omitted
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(entraineurs);
        return entraineurs;

    }
}
