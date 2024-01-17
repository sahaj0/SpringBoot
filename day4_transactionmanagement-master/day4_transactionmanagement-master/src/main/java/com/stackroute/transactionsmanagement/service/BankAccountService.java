package com.stackroute.transactionsmanagement.service;

import com.stackroute.transactionsmanagement.model.BankAccount;
import com.stackroute.transactionsmanagement.repository.BankAccountRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Transactional
    public void transferMoney(Long fromAccountId, Long toAccountId, double amount) {
        //write business logic for transferring money from one account to another

            BankAccount bankAccount=bankAccountRepository.findById(fromAccountId).orElseThrow(()->new RuntimeException("Account not found"));
            BankAccount toAccount=bankAccountRepository.findById(toAccountId).orElseThrow(()->new RuntimeException("Account not found"));
                if (bankAccount.getBalance()>=amount){
                    bankAccount.setBalance(bankAccount.getBalance()-amount);
                    toAccount.setBalance(toAccount.getBalance()+amount);
                    bankAccountRepository.save(bankAccount);
                    bankAccountRepository.save(toAccount);
                }
                else {
                throw new RuntimeException("insufficient balance for transfer");

    }}
}

