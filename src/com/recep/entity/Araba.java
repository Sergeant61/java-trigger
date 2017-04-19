package com.recep.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Araba {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String isim;
	private String marka;
	private String model;
	
	public Araba(){}
	
	public Araba(int id, String isim, String marka, String model) {
		super();
		this.id = id;
		this.isim = isim;
		this.marka = marka;
		this.model = model;
	}

	public int getId() {
		return id;
	}

	public String getIsim() {
		return isim;
	}

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	
}
