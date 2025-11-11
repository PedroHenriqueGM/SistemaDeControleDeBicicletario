package com.ms.equipamento.models;

import jakarta.persistence.*;

@Entity
@Table(name = "bicicleta")
public class Bicicleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String numero;

    @Column(nullable = false)
    private String status; // exemplo: "DISPONIVEL", "REPARO", "INTEGRADA"

    // Getters e Setters
}
