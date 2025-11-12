package com.ms.equipamento.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "trancas")
public class Tranca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //leitura do numero especifico
    @Column(unique = true, nullable = false)
    private String numeroUnico;

    // status de acordo com a lista de status citada documento de casos de uso
    //Livre; Ocupada; Em reparo; Aposentada
    @Column(nullable = false)
    private String status; 

  
    @ManyToOne
    @JoinColumn(name = "totem_id")
    private Totem totem;

    // usando o OneToOne pois um tranca pode ter uma bicicleta
    @OneToOne
    @JoinColumn(name = "bicicleta_id", nullable = true)
    private Bicicleta bicicleta;

    private LocalDateTime dataUltimaIntegracao;
    private String ultimoReparadorIntegracaoId; // quem foi o ultimo que devolveu

    private String reparadorResponsavelReparoId; // o responsável pelo reparo

    public Long getId() {
        return id;
    }

    public String getNumeroUnico() {
        return numeroUnico;
    }

    public void setNumeroUnico(String numeroUnico) {
        this.numeroUnico = numeroUnico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Totem getTotem() {
        return totem;
    }

    public void setTotem(Totem totem) {
        this.totem = totem;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public LocalDateTime getDataUltimaIntegracao() {
        return dataUltimaIntegracao;
    }

    public void setDataUltimaIntegracao(LocalDateTime dataUltimaIntegracao) {
        this.dataUltimaIntegracao = dataUltimaIntegracao;
    }

    public String getUltimoReparadorIntegracaoId() {
        return ultimoReparadorIntegracaoId;
    }

    public void setUltimoReparadorIntegracaoId(String ultimoReparadorIntegracaoId) {
        this.ultimoReparadorIntegracaoId = ultimoReparadorIntegracaoId;
    }

    public String getReparadorResponsavelReparoId() {
        return reparadorResponsavelReparoId;
    }

    public void setReparadorResponsavelReparoId(String reparadorResponsavelReparoId) {
        this.reparadorResponsavelReparoId = reparadorResponsavelReparoId;
    }
}
