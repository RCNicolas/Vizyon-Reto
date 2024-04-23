package com.example.vizyon.repositories;

import com.example.vizyon.models.TipoProteccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoProteccionRepository extends JpaRepository<TipoProteccion, Integer> {
}
