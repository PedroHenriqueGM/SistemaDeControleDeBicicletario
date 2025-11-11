package com.ms.equipamento.repositories;

import com.ms.equipamento.models.Bicicleta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {

    Optional<Bicicleta> findByNumero(String numero);
}
