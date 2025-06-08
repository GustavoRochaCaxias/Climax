package com.example.demo.repository;

import com.example.demo.model.OcorrenciaClimax;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepository extends JpaRepository<OcorrenciaClimax, Long> {
}
