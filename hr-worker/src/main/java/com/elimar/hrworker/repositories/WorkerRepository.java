package com.elimar.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elimar.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
