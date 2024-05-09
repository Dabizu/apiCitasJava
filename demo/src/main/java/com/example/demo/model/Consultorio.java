package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="consultorio")
@EntityListeners(AuditingEntityListener.class)
public class Consultorio {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private int numero_consultorio;
	private int piso;
	public int getNumero_consultorio() {
		return numero_consultorio;
	}
	public void setNumero_consultorio(int numero_consultorio) {
		this.numero_consultorio = numero_consultorio;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
}
