package com.spring.batch.bank.batchProcessing;

import com.spring.batch.bank.entity.BankTransaction;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

public class BankTransactionITemReader extends FlatFileItemReader<BankTransaction> {
    @Value("${inputFile}")
    private Resource inputFile;
    @Autowired
    private LineMapper<BankTransaction> lineMapper;

    public BankTransactionITemReader() {
        FlatFileItemReader<BankTransaction> flatFileItemReader = new FlatFileItemReader<>();
        flatFileItemReader.setName("FFIR1");
        flatFileItemReader.setLinesToSkip(1);
        flatFileItemReader.setResource(inputFile);
        flatFileItemReader.setLineMapper(lineMapper);
    }
}
