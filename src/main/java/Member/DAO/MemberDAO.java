package Member.DAO;

import Member.Model.Member;
import Utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MemberDAO {

    public void  ajouterMember(Member member) {

        try (Connection con = DBConnection.getConnection()) {

            String query = "insert into Members(username,email,password,dateNaissance,sport) values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, member.getUserame());
            ps.setString(2, member.getEmail());
            ps.setString(3, member.getPassword());
            ps.setString(4, member.getDateNaissance());
            ps.setString(5, member.getSport());
            ps.executeUpdate();

        }catch(SQLException e) {
            e.printStackTrace();
        }

    }

    public Member loginMember(String email, String password)  {

        Member member = null;
        try(Connection con = DBConnection.getConnection()){
            String query = "SELECT * FROM Members WHERE email=? AND password=?";
            PreparedStatement stmnt = con.prepareStatement(query);
            stmnt.setString(1, email);
            stmnt.setString(2, password);
            ResultSet rs = stmnt.executeQuery();

            if(rs.next()) {
                member = new Member();
                member.setId(rs.getInt("id"));
                member.setUserame(rs.getString("username"));
            }

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return member;
    }

}
