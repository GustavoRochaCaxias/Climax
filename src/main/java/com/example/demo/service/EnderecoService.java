package com.example.demo.service;

import com.example.demo.model.EnderecoClimax;
import com.example.demo.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public List<EnderecoClimax> listarTodos() {
        return enderecoRepository.findAll();
    }
}