package com.spring.batch.bank.batchProcessing;

import com.spring.batch.bank.Repository.TransactionRepository;
import com.spring.batch.bank.entity.Transaction;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankTransctionItemWriter implements ItemWriter<Transaction> {
    @Autowired
    private TransactionRepository transactionRepository;
    @Override
    public void write(List<? extends Transaction> transactionsList) throws Exception {
        // save all Transactions to Database ( After Processing )
            // loop over the list of preocessed Items => Transaction objects
            for(Transaction transaction : transactionsList){
                // save evrey transaction to Database
                transactionRepository.save(transaction);
            }
    }
}
