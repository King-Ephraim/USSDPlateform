package com.ussd.ussdplateform.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")  // Renommé pour éviter d'utiliser un mot réservé
    private Long id ;

    @Column(name = "type")
    private String type ;

    @Column(name = "montant")
    private Double montant ;

    @Column(name = "date")
    private LocalDateTime date ;

    @Column(name = "reference")
    private String reference ;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id", nullable = false)
    private Utilisateur utilisateur ;

    // Constructeurs

    public Transaction() {}

    public Transaction(String type, Double montant, LocalDateTime date, Utilisateur utilisateur, String reference) {
        this.type = type;
        this.montant = montant;
        this.date = date;
        this.utilisateur = utilisateur;
        this.reference = reference;
    }

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}