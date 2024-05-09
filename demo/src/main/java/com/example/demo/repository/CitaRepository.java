package com.example.demo.repository;


import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Cita;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long>{

	List<Cita> findByHorarioConsulta(Date fecha);

	List<Cita> findByConsultorio(long consultorio);
	
}
