package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ENDERECO_CLIMAX")
public class EnderecoClimax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Long id;

    private String rua;
    private String numero;
    private String bairro;
    private String cep;

    @ManyToOne
    @JoinColumn(name = "id_localizacao", nullable = false)
    private LocalizacaoClimax localizacao;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public LocalizacaoClimax getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(LocalizacaoClimax localizacao) {
        this.localizacao = localizacao;
    }
}
