package com.cleanArchitecture.Codelab.infrastructure.persistence;

import com.cleanArchitecture.Codelab.domain.model.Producto;
import com.cleanArchitecture.Codelab.domain.repository.ProductoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductoRepositoryImpl extends JpaRepository<Producto, Long>, ProductoRepository {
    @Override
    List<Producto> findAll();

    @Override
    Optional<Producto> findById(Long id);
}