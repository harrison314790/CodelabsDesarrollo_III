package com.cleanArchitecture.Codelab.domain.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "productos")
public record Producto(Long id, String nombre, Double precio) {}
