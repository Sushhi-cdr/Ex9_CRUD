package com.example.Ex9.Services;

import com.example.Ex9.Models.Projeto;
import com.example.Ex9.Repositories.RepositorioProjeto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoProjeto {

    @Autowired
    private RepositorioProjeto repositorio;

    public Projeto criar(Projeto projeto){
        return repositorio.save(projeto);
    }

    public List<Projeto> listar(){
        return repositorio.findAll();
    }

    public Projeto buscarPorId(Long id){
        return repositorio.findById(id).orElse(null);
    }

    public void deletar(Long id){
        repositorio.deleteById(id);
    }
}
