package com.example.demo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cita;
import com.example.demo.repository.CitaRepository;

@RestController
@RequestMapping("apiCita")
public class CitaController {
	@Autowired
	private CitaRepository citaRepository;
	
	@PostMapping("/altaCita/{}")
	public String altaCita(@RequestBody Cita cita) {
		try {
			//aqui estoy consultando si hay personas en la misma hora y consultorio
			List<Cita> listaCitas = citaRepository.findByConsultorio(cita.getConsultorio());
			for(int i=0;i<listaCitas.size();i++) {
				//si entra aqui saca un cero diciendo que no se puede registrar por el horario
				if(listaCitas.get(i).getHorarioConsulta().equals(cita.getHorarioConsulta())) {
					return "0";
				}
			}
			//aqui se registra la cita
			citaRepository.save(cita);
			return "1";
		} catch (Exception e) {
			// aqui me dice que hay un error
			return "e";
		}
	}
	
	@GetMapping("/consultarCita/{fecha}")
	public List<Cita> findByName(@PathVariable("fecha") Date fecha) {
		return citaRepository.findByHorarioConsulta(fecha);
	}
}
