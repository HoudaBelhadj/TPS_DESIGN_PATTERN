package com.spring.batch.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data @ToString @NoArgsConstructor @AllArgsConstructor
public class Compte {
    @Id
    private long idCompte;
    private double solde;
    @OneToMany
    private List<Transaction> transactionList;
}
