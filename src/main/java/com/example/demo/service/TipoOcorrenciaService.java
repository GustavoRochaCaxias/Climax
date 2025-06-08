package com.example.demo.service;
;
import com.example.demo.model.TipoOcorrenciaClimax;
import com.example.demo.repository.TipoOcorrenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoOcorrenciaService {

    private final TipoOcorrenciaRepository repository;

    public TipoOcorrenciaService(TipoOcorrenciaRepository repository) {
        this.repository = repository;
    }

    public List<TipoOcorrenciaClimax> listarTodos() {
        return repository.findAll();
    }

    public Optional<TipoOcorrenciaClimax> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public TipoOcorrenciaClimax salvar(TipoOcorrenciaClimax tipo) {
        return repository.save(tipo);
    }

    public void deletarPorId(Long id) {
        repository.deleteById(id);
    }
}