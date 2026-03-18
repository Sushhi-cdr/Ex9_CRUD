package com.example.Ex9.Controllers;

import com.example.Ex9.Models.Projeto;
import com.example.Ex9.Services.ServicoProjeto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Projeto")
public class ControleProjeto {

    @Autowired
    private ServicoProjeto servico;

    @PostMapping
    public Projeto criar(@RequestBody Projeto projeto){
        return servico.criar(projeto);
    }

    @GetMapping
    public List<Projeto> listar(){
        return servico.listar();
    }

    @GetMapping("/{id}")
    public Projeto buscarPorId(@PathVariable Long id){
        return servico.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        servico.deletar(id);
    }
}
