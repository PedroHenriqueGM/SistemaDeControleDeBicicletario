package com.ms.equipamento.dtos;

public record IntegrarRequest(
        String numero,
        Long idTranca,
        Long idTotem) {}
