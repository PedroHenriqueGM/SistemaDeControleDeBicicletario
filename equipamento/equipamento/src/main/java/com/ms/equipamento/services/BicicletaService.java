package com.ms.equipamento.services;

import com.ms.equipamento.dtos.BicicletaDTO;
import com.ms.equipamento.dtos.IntegrarRequest;
import com.ms.equipamento.dtos.StatusRequest;
import com.ms.equipamento.models.Bicicleta;
import com.ms.equipamento.repositories.BicicletaRepository;
import org.springframework.stereotype.Service;

@Service
public class BicicletaService {

    private final BicicletaRepository repository;

    public BicicletaService(BicicletaRepository repository) {
        this.repository = repository;
    }

    public BicicletaDTO consultar(Long id) {
        Bicicleta bicicleta = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bicicleta não encontrada"));

        return new BicicletaDTO(bicicleta.getId(), bicicleta.getNumero(), bicicleta.getStatus());
    }

    public void integrarNaRede(IntegrarRequest request) {
        // 1. Criar bicicleta nova
        Bicicleta bicicleta = new Bicicleta(request.numero(), "DISPONIVEL");
        bicicleta = repository.save(bicicleta);

        // Aqui futuramente chamaremos trancaClient, notificações etc.
    }

    public void alterarStatus(Long id, String novoStatus) {
        Bicicleta bicicleta = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bicicleta não encontrada"));

        bicicleta.setStatus(novoStatus);
        repository.save(bicicleta);
    }
}
