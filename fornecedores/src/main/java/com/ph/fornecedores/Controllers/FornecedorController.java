package com.ph.fornecedores.Controllers;


import com.ph.fornecedores.Entity.FornecedorEntity;
import com.ph.fornecedores.Service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    public FornecedorService fornecedorService;

    @PostMapping
    public FornecedorEntity create(@RequestBody FornecedorEntity fornecedorEntity){
        return fornecedorService.create(fornecedorEntity);
    }

    @GetMapping
    public List<FornecedorEntity> findAll(){
        return fornecedorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<FornecedorEntity> findById(@PathVariable Long id){
        return fornecedorService.findId(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        fornecedorService.delete(id);
    }
}
