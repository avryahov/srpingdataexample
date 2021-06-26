package ru.ryahov.devcolibri.srpingdataexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ryahov.devcolibri.srpingdataexample.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
