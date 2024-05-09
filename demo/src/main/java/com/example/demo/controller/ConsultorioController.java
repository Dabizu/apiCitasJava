package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Consultorio;
import com.example.demo.model.Doctor;
import com.example.demo.repository.ConsultorioRepository;

@RestController
@RequestMapping("apiConsultorio")
public class ConsultorioController {
	@Autowired
	private ConsultorioRepository consultorioRepository;
	@PostMapping("/altaDoctor")
	public String altaDoctor(@RequestBody Consultorio consultorio) {
		try {
			consultorioRepository.save(consultorio);
			return "1";
		} catch (Exception e) {
			// TODO: handle exception
			return "0";
		}
	}
}
