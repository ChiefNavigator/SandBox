package com.sandbox.service.transactiontest;

import com.sandbox.domain.testtransaction.TestTransactionDomain;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TestTransactionService {

    private final TestTransactionDomain testTransactionDomain;

    public void executeTest1() {
        log.info("A");
        testTransactionDomain.processTest1();
        log.info("D");
    }
}
