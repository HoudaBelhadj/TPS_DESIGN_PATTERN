package com.spring.batch.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import java.util.Date;

@Data @ToString @NoArgsConstructor @AllArgsConstructor
public class BankTransaction {
    private long idTransaction;
    private long idCompte;
    private double montant;
    private String startTransactionDate;
}
