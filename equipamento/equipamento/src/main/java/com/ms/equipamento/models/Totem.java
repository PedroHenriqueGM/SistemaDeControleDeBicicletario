package com.ms.equipamento.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "totens")
public class Totem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String localizacao;

    // usando o OneToMany pois um totem tem muitas trancas
    @OneToMany(mappedBy = "totem", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tranca> trancas = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public List<Tranca> getTrancas() {
        return trancas;
    }

    public void setTrancas(List<Tranca> trancas) {
        this.trancas = trancas;
    }
}
