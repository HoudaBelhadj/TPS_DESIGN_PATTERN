package com.spring.batch.bank.batchProcessing;

import com.spring.batch.bank.Repository.CompteRepository;
import com.spring.batch.bank.entity.BankTransaction;
import com.spring.batch.bank.entity.Compte;
import com.spring.batch.bank.entity.Transaction;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@Component
public class BankTransactionProcessor implements ItemProcessor<BankTransaction, Transaction> {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm");
    @Autowired
    private CompteRepository compteRepository;
    @Override
    public Transaction process(BankTransaction bankTransaction) throws Exception {
        // Effectuer nos traitement ici
        Date todayDate = Calendar.getInstance().getTime();

        // Get compte with id
        Compte compte = compteRepository.getById(bankTransaction.getIdCompte());

        // Create the transaction
        Transaction transaction = new Transaction();
        transaction.setIdTransaction(bankTransaction.getIdTransaction());
        transaction.setDateTransaction(simpleDateFormat.parse(bankTransaction.getStartTransactionDate()));
        transaction.setMontant(bankTransaction.getMontant());
        transaction.setDateDebit(todayDate);
        transaction.setCompte(compte);
        return transaction;
    }
}
