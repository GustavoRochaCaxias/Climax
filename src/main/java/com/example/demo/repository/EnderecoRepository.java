package com.example.demo.repository;


import com.example.demo.model.EnderecoClimax;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<EnderecoClimax, Long> {
}