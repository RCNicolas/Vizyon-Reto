package com.example.vizyon.repositories;

import com.example.vizyon.models.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer> {
}
