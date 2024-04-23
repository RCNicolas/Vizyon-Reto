package com.example.vizyon.repositories;

import com.example.vizyon.models.Insumo;
import com.example.vizyon.models.insumoprendas.InsumoPrendas;
import com.example.vizyon.models.insumoprendas.InsumoPrendasId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsumoPrendasRepository extends JpaRepository<InsumoPrendas, InsumoPrendasId> {
}
