package com.example.BankSysytem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BankSysytem.entity.Statement;

@Repository
public interface StatementDao extends JpaRepository<Statement, String> {

}



