package com.ms.equipamento.controllers;

import com.ms.equipamento.dtos.*;
import com.ms.equipamento.services.BicicletaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bicicleta")
public class BicicletaController {

    private final BicicletaService service;

    public BicicletaController(BicicletaService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BicicletaDTO> consultar(@PathVariable Long id) {
        return ResponseEntity.ok(service.consultar(id));
    }

    @PostMapping("/integrar")
    public ResponseEntity<String> integrar(@RequestBody IntegrarRequest request) {
        service.integrarNaRede(request);
        return ResponseEntity.ok("Bicicleta integrada na rede com sucesso!");
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<String> alterarStatus(
            @PathVariable Long id,
            @RequestBody StatusRequest request) {

        service.alterarStatus(id, request.status());
        return ResponseEntity.ok("Status atualizado com sucesso!");
    }
}
