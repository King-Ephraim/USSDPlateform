package com.ussd.ussdplateform.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id ;

    @Column(name = "telephone",unique = true)
    private String telephone ;

    @Column(name = "pin")
    private String pin ;

    @Column(name = "solde")
    private Double solde ;

    @OneToMany(mappedBy = "utilisateur",cascade = CascadeType.ALL)
    List<Transaction> transactions ;
    // constructeurs
    public Utilisateur(){}

    public Utilisateur(String telephone, String pin, Double solde) {
        this.telephone = telephone;
        this.pin = pin;
        this.solde = solde;
    }

    // getters & setters

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    // methode pour verifier le pin d'un utilisateur
//    public Boolean verifierPin(String pin) {
//
//    }
//    //methode pour crediter son compte
//    public void crediter(Double montant) {
//
//    }
//    //methode pour debiter son compte
//    public void debiter(Double montant) {
//
//    }

}
