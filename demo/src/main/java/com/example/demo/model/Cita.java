package com.example.demo.model;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cita")
@EntityListeners(AuditingEntityListener.class)
public class Cita {
	private long consultorio;
	private long doctor;
	@Column(name = "date_registry")
	@CreatedDate
	private Date horarioConsulta;
	private String nombrePaciente;
	public Cita(long consultorio, long doctor, Date horarioConsulta, String nombrePaciente) {
		this.setConsultorio(consultorio);
		this.doctor=doctor;
		this.horarioConsulta=horarioConsulta;
		this.nombrePaciente=nombrePaciente;
	}
	
	public long getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(long consultorio) {
		this.consultorio = consultorio;
	}
	
	public long getDoctor() {
		return doctor;
	}
	public void setDoctor(long doctor) {
		this.doctor = doctor;
	}
	public void setHorarioConsulta(Date horarioConsulta) {
		this.horarioConsulta=horarioConsulta;
	}
	public Date getHorarioConsulta() {
		return this.horarioConsulta;
	}
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
}
