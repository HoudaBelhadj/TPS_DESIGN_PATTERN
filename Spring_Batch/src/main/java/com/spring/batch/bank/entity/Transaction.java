package com.spring.batch.bank.entity;

import com.spring.batch.bank.entity.Compte;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import java.util.Date;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    private long idTransaction;
    private double montant;
    private Date dateTransaction;
    private Date dateDebit;
    @ManyToOne
    private Compte compte;
}
