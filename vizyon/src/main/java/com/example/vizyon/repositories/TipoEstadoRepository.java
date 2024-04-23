package com.example.vizyon.repositories;

import com.example.vizyon.models.TipoEstado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEstadoRepository extends JpaRepository<TipoEstado, Integer>  {
}
