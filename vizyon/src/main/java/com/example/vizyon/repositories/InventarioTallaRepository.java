package com.example.vizyon.repositories;

import com.example.vizyon.models.inventariotalla.InventarioTalla;
import com.example.vizyon.models.inventariotalla.InventarioTallaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioTallaRepository extends JpaRepository<InventarioTalla, InventarioTallaId> {
}
