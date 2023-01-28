package com.example.demo.uce.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.IAutomovilRepo;

@Service	
public class RentaServiceImpl implements IRentaService {
	@Autowired
	IAutomovilRepo iAutomovilRepo;
	
	@Override
	public void realizarRenta(String placa, String cedula, BigDecimal nDias, String nTarjeta) {
		// TODO Auto-generated method stub
		
	}

}
