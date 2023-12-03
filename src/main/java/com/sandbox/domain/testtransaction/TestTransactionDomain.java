package com.sandbox.domain.testtransaction;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
public class TestTransactionDomain {


    @Transactional
    public void processTest1() {
        log.info("B");
        throwRunTimeException();
        log.info("C");
    }

    private void throwRunTimeException() {
        throw new RuntimeException();
    }

}
