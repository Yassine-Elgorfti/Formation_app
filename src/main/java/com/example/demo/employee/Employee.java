package com.example.demo.employee;
import java.time.LocalDate;
import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "employee")
public class Employee {
        @Id
        @SequenceGenerator(
                name = "employee_sequence",
                sequenceName = "employee_sequence",
                allocationSize = 1
        )
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "employee_sequence"
        )
        private Long matricule;

        private String mdp;

        private String nom;

        private String prenom;

        private LocalDate dateNaissance;

        private String genre;

        private String email;

        private String fonction;

        private Integer idDirection;

        private Integer idDepartement;

// ******************Constructors******************
        public Employee(Long matricule, String mdp, String nom, String prenom, LocalDate dateNaissance, String genre, String email, String fonction, Integer idDirection, Integer idDepartement) {
                this.matricule = matricule;
                this.mdp = mdp;
                this.nom = nom;
                this.prenom = prenom;
                this.dateNaissance = dateNaissance;
                this.genre = genre;
                this.email = email;
                this.fonction = fonction;
                this.idDirection = idDirection;
                this.idDepartement = idDepartement;
        }

        public Employee(String mdp, String nom, String prenom, LocalDate dateNaissance, String genre, String email, String fonction, Integer idDirection, Integer idDepartement) {
                this.mdp = mdp;
                this.nom = nom;
                this.prenom = prenom;
                this.dateNaissance = dateNaissance;
                this.genre = genre;
                this.email = email;
                this.fonction = fonction;
                this.idDirection = idDirection;
                this.idDepartement = idDepartement;
        }

        public Employee() {
        }
// ******************GETTERS AND SETTERS**********************
        public Long getMatricule() {
                return matricule;
        }

        public void setMatricule(Long matricule) {
                this.matricule = matricule;
        }

        public String getMdp() {
                return mdp;
        }

        public void setMdp(String mdp) {
                this.mdp = mdp;
        }

        public String getNom() {
                return nom;
        }

        public void setNom(String nom) {
                this.nom = nom;
        }

        public String getPrenom() {
                return prenom;
        }

        public void setPrenom(String prenom) {
                this.prenom = prenom;
        }

        public LocalDate getDateNaissance() {
                return dateNaissance;
        }

        public void setDateNaissance(LocalDate dateNaissance) {
                this.dateNaissance = dateNaissance;
        }

        public String getGenre() {
                return genre;
        }

        public void setGenre(String genre) {
                this.genre = genre;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getFonction() {
                return fonction;
        }

        public void setFonction(String fonction) {
                this.fonction = fonction;
        }

        public Integer getIdDirection() {
                return idDirection;
        }

        public void setIdDirection(Integer idDirection) {
                this.idDirection = idDirection;
        }

        public Integer getIdDepartement() {
                return idDepartement;
        }

        public void setIdDepartement(Integer idDepartement) {
                this.idDepartement = idDepartement;
        }
}
