package com.ms.equipamento.models;

import jakarta.persistence.*;

@Entity
@Table(name = "bicicletas")
public class Bicicleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;

    private String status;

    public Bicicleta() {
    }

    public Bicicleta(String numero, String status) {
        this.numero = numero;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
