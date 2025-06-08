package com.example.demo.repository;

import com.example.demo.model.TipoOcorrenciaClimax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoOcorrenciaRepository extends JpaRepository<TipoOcorrenciaClimax, Long> {
}