package com.example.Ex9.Repositories;

import com.example.Ex9.Models.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.support.Repositories;

public interface RepositorioProjeto extends JpaRepository<Projeto, Long> {
}
