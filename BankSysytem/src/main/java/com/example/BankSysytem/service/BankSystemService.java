package com.example.BankSysytem.service;

import com.example.BankSysytem.entity.Acount;
import com.example.BankSysytem.entity.AcountTransfer;
import com.example.BankSysytem.entity.MonthlyStatement;
import com.example.BankSysytem.repository.AcountDao;
import com.example.BankSysytem.repository.StatementDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankSystemService {

    @Autowired
    private AcountDao acountDao;

    @Autowired
    private StatementDao statementDao;

    public void createAccount(Acount account) {

        acountDao.save(account);
    }

    public void transfer(AcountTransfer acountTransfer) {
        debitFromAcount(acountTransfer.getFromAcNumber(), acountTransfer.getAmount());
        creditToAcount(acountTransfer.getToAcNumber(), acountTransfer.getAmount());

    }


    public boolean debitFromAcount(double fromAcNumber, double amount) {
       
        return true;
    }

    public boolean creditToAcount(double toAcNumber, double amount) {
        return true;
    }

    public void generateMonthlyStatement(MonthlyStatement monthlyStatement) {
        statementDao.findById(monthlyStatement.getMonth());

    }
}
