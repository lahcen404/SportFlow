package Member.Model;


import java.time.LocalDate;

public class Member {


        private int id;
        private String username;
        private String email;
        private String password;
        private String dateNaissance;
        private String sport;


    public Member(int id, String username, String email, String password, String dateNaissance, String sport) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.dateNaissance = dateNaissance;
        this.sport = sport;
    }

    public Member(String username, String email, String password, String dateNaissance, String sport) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.dateNaissance = dateNaissance;
        this.sport = sport;
    }

    public Member() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserame() {
        return username;
    }

    public void setUserame(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", sport='" + sport + '\'' +
                '}';
    }
}

