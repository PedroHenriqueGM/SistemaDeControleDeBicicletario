package com.ms.equipamento.repositories;

import com.ms.equipamento.models.Tranca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrancaRepository extends JpaRepository<Tranca, Long> {

    Optional<Tranca> findByNumeroUnico(String numeroUnico);
}
