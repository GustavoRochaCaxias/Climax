package com.example.demo.service;

import com.example.demo.model.OcorrenciaClimax;
import com.example.demo.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {

    @Autowired
    private OcorrenciaRepository repository;

    public List<OcorrenciaClimax> listarTodas() {
        return repository.findAll();
    }

    public void salvar(OcorrenciaClimax ocorrencia) {
        repository.save(ocorrencia);
    }

    public Optional<OcorrenciaClimax> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
