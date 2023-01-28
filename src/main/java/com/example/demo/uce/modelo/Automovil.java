package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="automovil")
public class Automovil {
	@Id
	@Column(name="auto_placa")
	private String placa;
	@Column(name="auto_valor_por_dia")
	private BigDecimal valorDia;
	
	@OneToMany(mappedBy = "Automovil")
	List<Renta> renta;
	

	
	public List<Renta> getRenta() {
		return renta;
	}
	public void setRenta(List<Renta> renta) {
		this.renta = renta;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public BigDecimal getValorDia() {
		return valorDia;
	}
	public void setValorDia(BigDecimal valorDia) {
		this.valorDia = valorDia;
	}
	
	
}
