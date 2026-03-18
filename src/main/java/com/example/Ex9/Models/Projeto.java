package com.example.Ex9.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_projeto")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeProjeto")
    private String nomeProjeto;

    @Column(name = "dataInicioProjeto")
    private LocalDate dataInicioProjeto;

    private LocalDate dataFimProjeto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public LocalDate getDataInicioProjeto() {
        return dataInicioProjeto;
    }

    public void setDataInicioProjeto(LocalDate dataInicioProjeto) {
        this.dataInicioProjeto = dataInicioProjeto;
    }

    public LocalDate getDataFimProjeto() {
        return dataFimProjeto;
    }

    public void setDataFimProjeto(LocalDate dataFimProjeto) {
        this.dataFimProjeto = dataFimProjeto;
    }
}
