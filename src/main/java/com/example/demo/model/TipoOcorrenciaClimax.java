package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TIPO_OCORRENCIA_CLIMAX")
public class TipoOcorrenciaClimax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo")
    private Long idTipo;

    @Column(name = "nome_tipo", nullable = false, unique = true, length = 100)
    private String nomeTipo;

    // Getters e Setters

    public Long getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }
}
