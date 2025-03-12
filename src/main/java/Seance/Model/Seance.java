package Seance.Model;

import java.time.LocalDateTime;

public class Seance {



        private int Seance_id;
        private int memberId;
        private int entraineurId;
        private LocalDateTime dateHeure;


        public Seance() {
        }


        public Seance(int Seance_id, int memberId, int entraineurId, LocalDateTime dateHeure) {
            this.Seance_id = Seance_id;
            this.memberId = memberId;
            this.entraineurId = entraineurId;
            this.dateHeure = dateHeure;
        }


        public int getId() {
            return Seance_id;
        }

        public void setId(int Seance_id) {
            this.Seance_id = Seance_id;
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

