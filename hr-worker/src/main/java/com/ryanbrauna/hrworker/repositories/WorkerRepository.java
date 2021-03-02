package com.ryanbrauna.hrworker.repositories;

import com.ryanbrauna.hrworker.models.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
