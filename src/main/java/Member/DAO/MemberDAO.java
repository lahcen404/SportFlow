package Member.DAO;

import Member.Model.Member;
import Utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MemberDAO {

    public void  ajouterMember(Member member) {

        try (Connection con = DBConnection.getConnection()) {

            String query = "insert into Members(username,email,password,dateNaissance,sport) values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, member.getName());
            ps.setString(2, member.getEmail());
            ps.setString(3, member.getPassword());
            ps.setString(4, member.getDateNaissance());
            ps.setString(5, member.getSport());
            ps.executeUpdate();

        }catch(SQLException e) {
            e.printStackTrace();
        }

    }

}
