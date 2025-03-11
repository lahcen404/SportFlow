package Seance.Model;

import java.time.LocalDateTime;

public class Seance {



        private int id;
        private int memberId;
        private int entraineurId;
        private LocalDateTime dateHeure;


        public Seance() {
        }


        public Seance(int id, int memberId, int entraineurId, LocalDateTime dateHeure) {
            this.id = id;
            this.memberId = memberId;
            this.entraineurId = entraineurId;
            this.dateHeure = dateHeure;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getMemberId() {
            return memberId;
        }

        public void setMemberId(int memberId) {
            this.memberId = memberId;
        }

        public int getEntraineurId() {
            return entraineurId;
        }

        public void setEntraineurId(int entraineurId) {
            this.entraineurId = entraineurId;
        }

        public LocalDateTime getDateHeure() {
            return dateHeure;
        }

        public void setDateHeure(LocalDateTime dateHeure) {
            this.dateHeure = dateHeure;
        }
    }

