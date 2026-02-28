package com.ProcessoLogistico.ProcessoLogistico.repositories;

import com.ProcessoLogistico.ProcessoLogistico.domain.Encomendas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EncomendasRepository extends JpaRepository<Encomendas , UUID> {

    @Override
    Optional<Encomendas> findById(UUID uuid);
}
