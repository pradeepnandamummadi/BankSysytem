package com.example.BankSysytem.controller;

import com.example.BankSysytem.entity.Acount;
import com.example.BankSysytem.entity.AcountTransfer;
import com.example.BankSysytem.entity.MonthlyStatement;
import com.example.BankSysytem.service.BankSystemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AcountController {

    @Autowired
    private BankSystemService bankSystemService;



    @GetMapping("/create bank account")
    public void createAccount(@RequestBody Acount account) {

        bankSystemService.createAccount(account);

    }


    @GetMapping("/transfer")
    public void transfer(@RequestBody AcountTransfer accountTransfer) {

        bankSystemService.transfer(accountTransfer);
    }

    @GetMapping("/monthlystatement")
    public void monthlyStatement(@RequestBody MonthlyStatement monthlyStatement) {
       bankSystemService.generateMonthlyStatement(monthlyStatement);
    }


}
