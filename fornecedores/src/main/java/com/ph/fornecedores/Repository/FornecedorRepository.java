package com.ph.fornecedores.Repository;

import com.ph.fornecedores.Entity.FornecedorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository <FornecedorEntity, Long> {
}
