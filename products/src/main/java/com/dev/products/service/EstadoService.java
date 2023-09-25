package com.dev.products.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.products.entity.Estado;
import com.dev.products.repository.EstadoRepository;

@Service
public class EstadoService {
    
    @Autowired
    private EstadoRepository stateRepo;

    public List<Estado> buscarTodos(){
        return stateRepo.findAll();
    }

    public Estado inserir(Estado estado){
        estado.setDataCriacao(new Date());
        Estado novo = stateRepo.saveAndFlush(estado);
        return novo;
    }   
    public Estado alterar(Estado estado){
        estado.setDataAtualizacao(new Date());
        return stateRepo.saveAndFlush(estado);  
    }   
    public void excluir(Long id){
        Estado estado = stateRepo.findById(id).get();
        stateRepo.delete(estado);
    }
}
