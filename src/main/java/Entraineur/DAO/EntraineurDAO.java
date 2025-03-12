package Entraineur.DAO;

import Entraineur.Model.Entraineur;
import Member.Model.Member;
import Utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EntraineurDAO {

    public void  ajouterEntraineur(Entraineur entraineur) {

        try (Connection con = DBConnection.getConnection()) {

            String query = "insert into Entraineurs(username,email,password,specialite) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, entraineur.getName());
            ps.setString(2, entraineur.getEmail());
            ps.setString(3, entraineur.getPassword());
            ps.setString(4, entraineur.getSpecialite());

            ps.executeUpdate();

        }catch(SQLException e) {
            e.printStackTrace();
        }

    }
}
