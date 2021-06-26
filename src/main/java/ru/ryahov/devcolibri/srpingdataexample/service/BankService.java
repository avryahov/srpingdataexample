package ru.ryahov.devcolibri.srpingdataexample.service;

import ru.ryahov.devcolibri.srpingdataexample.entity.Bank;

import java.util.List;

public interface BankService {

    Bank addBank(Bank bank);

    void delete(Bank bank);

    Bank getById(long id);

    Bank getByName(String name);

    Bank editBank(Bank bank);

    List<Bank> getAll();
}
