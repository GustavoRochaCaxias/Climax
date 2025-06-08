package com.example.demo.repository;

import com.example.demo.model.LocalizacaoClimax;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalizacaoRepository extends JpaRepository<LocalizacaoClimax, Long> {
}