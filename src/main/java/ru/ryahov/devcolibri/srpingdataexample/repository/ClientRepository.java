package ru.ryahov.devcolibri.srpingdataexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ryahov.devcolibri.srpingdataexample.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
