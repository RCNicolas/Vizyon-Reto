package com.example.vizyon.repositories;

import com.example.vizyon.models.Cargos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargosRepository extends JpaRepository<Cargos, Integer> {
}
