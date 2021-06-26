package ru.ryahov.devcolibri.srpingdataexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ryahov.devcolibri.srpingdataexample.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
