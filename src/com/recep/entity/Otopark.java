package com.recep.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Otopark {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "araba_id")
	private Araba araba;
	
	public Otopark() {}
	
	public Otopark(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public Araba getAraba() {
		return araba;
	}

	public void setAraba(Araba araba) {
		this.araba = araba;
	}
	
	

}
