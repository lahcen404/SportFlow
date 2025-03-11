package Member.Model;


import java.time.LocalDate;

public class Member extends User.Model.User {


        private int id;
        private String nom;
        private LocalDate dateNaissance;
        private String sport;


        public Member() {
        }


        public Member(int userId, String username, String password, String role, int id, String nom, LocalDate dateNaissance, String sport) {
            super(userId, username, password, role); // userId maps to user_id in DB
            this.id = id;
            this.nom = nom;
            this.dateNaissance = dateNaissance;
            this.sport = sport;
        }

        // Getters and Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public LocalDate getDateNaissance() {
            return dateNaissance;
        }

        public void setDateNaissance(LocalDate dateNaissance) {
            this.dateNaissance = dateNaissance;
        }

        public String getSport() {
            return sport;
        }

        public void setSport(String sport) {
            this.sport = sport;
        }
}

