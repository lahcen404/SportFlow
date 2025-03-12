package Entraineur.Model;



public class Entraineur  {
    private int id;
    private String name;
    private String email;
    private String password;
    private String specialite;


    public Entraineur(int id, String name, String email, String password, String specialite) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.specialite = specialite;
    }

    public Entraineur(String name, String email, String password, String specialite) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.specialite = specialite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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