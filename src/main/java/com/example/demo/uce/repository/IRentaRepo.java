package com.example.demo.uce.repository;

import java.math.BigDecimal;

import com.example.demo.uce.modelo.Automovil;

public interface IRentaRepo {
	public void realizarRenta(String placa, String cedula,BigDecimal nDias,String nTarjeta);	
}
