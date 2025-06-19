package com.cleanArchitecture.Codelab.aplication.usecase;

import com.cleanArchitecture.Codelab.domain.model.Producto;
import com.cleanArchitecture.Codelab.domain.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarProductosUseCase {
    private final ProductoRepository productoRepository;

    public ListarProductosUseCase(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> ejecutar() {
        return productoRepository.findAll();
    }
}