package com.sandbox.api.testtransaction;

import com.sandbox.service.transactiontest.TestTransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TestTransactionController {

    private final TestTransactionService testTransactionService;

    @GetMapping("/test/transaction/1")
    public void test1(){
        testTransactionService.executeTest1();
    }
}
