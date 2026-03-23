package com.ph.fornecedores.Service;

import com.ph.fornecedores.Entity.FornecedorEntity;
import com.ph.fornecedores.Repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    public FornecedorRepository fornecedorRepository;

    public List<FornecedorEntity> findAll(){
        return fornecedorRepository.findAll();
    }

    public FornecedorEntity create(FornecedorEntity fornecedorEntity){
        return fornecedorRepository.save(fornecedorEntity);
    }

    public void delete(Long id){
        fornecedorRepository.deleteById(id);
    }

    public Optional<FornecedorEntity> findId(Long id){
        return fornecedorRepository.findById(id);
    }
}
