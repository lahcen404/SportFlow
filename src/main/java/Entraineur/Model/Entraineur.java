package Entraineur.Model;



public class Entraineur  {
    private int id;
    private String username;
    private String email;
    private String password;
    private String specialite;


    public Entraineur(int id, String username, String email, String password, String specialite) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.specialite = specialite;
    }

    public Entraineur(String username, String email, String password, String specialite) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.specialite = specialite;
    }

    public Entraineur() {

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

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}