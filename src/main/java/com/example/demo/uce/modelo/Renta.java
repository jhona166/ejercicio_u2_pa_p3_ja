package com.example.demo.uce.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="renta")
public class Renta {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rent_sec")
	@SequenceGenerator(name = "rent_sec", sequenceName = "rent_sec", allocationSize = 1)
	@Column(name="rent_id")
	private Integer id;
	@Column(name="rent_numero_tarjeta")
	private String numeroTarjeta;
	@Column(name="rent_valor")
	private BigDecimal valor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="rent_id_automovil")
	
	private Automovil automovil;
	
	@OneToOne(mappedBy = "renta")
	private Pago pago;
	
	
	
	//Set and get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	
	
	
}
