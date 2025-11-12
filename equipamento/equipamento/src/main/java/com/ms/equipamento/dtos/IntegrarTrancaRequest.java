package com.ms.equipamento.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

// DTO de request de acordo com o caso de uso 11
public record IntegrarTrancaRequest(
    @NotBlank(message = "Número da tranca é obrigatório")
    String numeroTranca,
    
    @NotNull(message = "ID do totem é obrigatório")
    Long idTotem,
    
    @NotBlank(message = "Matrícula do reparador é obrigatória")
    String matriculaReparador 
) {}