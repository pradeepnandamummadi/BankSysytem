package com.example.BankSysytem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BankSysytem.entity.Acount;


@Repository
public interface AcountDao extends JpaRepository<Acount, String> {

}
