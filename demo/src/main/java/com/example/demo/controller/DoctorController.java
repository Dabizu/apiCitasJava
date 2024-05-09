package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Doctor;
import com.example.demo.repository.DoctorRepository;

@RestController
@RequestMapping("apiDoctor")
public class DoctorController {
	@Autowired
	private DoctorRepository doctorRepository;
	
	@PostMapping("/altaDoctor")
	public String altaDoctor(@RequestBody Doctor doctor) {
		try {
			doctorRepository.save(doctor);
			return "1";
		} catch (Exception e) {
			// TODO: handle exception
			return "0";
		}
	}
}
