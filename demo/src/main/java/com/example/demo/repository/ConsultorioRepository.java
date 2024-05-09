package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Cita;
import com.example.demo.model.Consultorio;

@Repository
public interface ConsultorioRepository extends JpaRepository<Consultorio, Long>{

}
