package com.ms.equipamento.repositories;

import com.ms.equipamento.models.Totem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TotemRepository extends JpaRepository<Totem, Long> {
}
