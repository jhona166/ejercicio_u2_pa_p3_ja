package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="pago")
public class Pago {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pago_sec")
	@SequenceGenerator(name = "pago_sec", sequenceName = "pago_sec", allocationSize = 1)
	@Column(name="pago_id")
	private Integer id;
	@Column(name="pago_numero_tarjeta")
	private String nTarjeta;
	@Column(name="pago_valor")
	private BigDecimal valor;
	
	@JoinColumn(name="pago_id_renta")
	private Renta renta;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getnTarjeta() {
		return nTarjeta;
	}
	public void setnTarjeta(String nTarjeta) {
		this.nTarjeta = nTarjeta;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	

}
