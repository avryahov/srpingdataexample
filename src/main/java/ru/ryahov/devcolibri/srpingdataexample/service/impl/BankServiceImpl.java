package ru.ryahov.devcolibri.srpingdataexample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ryahov.devcolibri.srpingdataexample.entity.Bank;
import ru.ryahov.devcolibri.srpingdataexample.repository.BankRepository;
import ru.ryahov.devcolibri.srpingdataexample.service.BankService;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankRepository bankRepository;

    @Override
    public Bank addBank(Bank bank) {
        return bankRepository.saveAndFlush(bank);
    }

    @Override
    public void delete(Bank bank) {
        bankRepository.delete(bank);
    }

    @Override
    public Bank getById(long id) {
        return bankRepository.getOne(id);
    }

    @Override
    public Bank editBank(Bank bank) {
        return bankRepository.saveAndFlush(bank);
    }

    @Override
    public List<Bank> getAll() {
        return bankRepository.findAll();
    }

    @Override
    public Bank getByName(String name) {
        return bankRepository.findByName(name);
    }
}
