package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "OCORRENCIA_CLIMAX")
public class OcorrenciaClimax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Oracle 12c+ suporta IDENTITY
    @Column(name = "id_ocorrencia")
    private Long id;

    @Column(name = "titulo", length = 100, nullable = false)
    private String titulo;

    @Column(name = "descricao", length = 1000)
    private String descricao;

    @Column(name = "data_ocorrencia")
    private LocalDateTime dataOcorrencia;

    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;  // FK simples; ideal usar @ManyToOne para relacionar

    @Column(name = "id_endereco", nullable = false)
    private Long idEndereco; // FK simples; ideal usar @ManyToOne para relacionar

    @Column(name = "id_tipo", nullable = false)
    private Long idTipo; // FK simples; ideal usar @ManyToOne para relacionar

    // getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(LocalDateTime dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Long getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }
}
