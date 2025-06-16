package com.cleanArchitecture.Codelab.domain.repository;

import com.cleanArchitecture.Codelab.domain.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository {
    List<Producto> listarProductos();
    Optional<Producto> findById(Long id);

    List<Producto> findAll();
}