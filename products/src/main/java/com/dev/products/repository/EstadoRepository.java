package com.dev.products.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.products.entity.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{
        
}
