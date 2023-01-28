package com.example.demo.uce.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class RentaRepo implements IRentaRepo{
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void realizarRenta(String placa, String cedula, BigDecimal nDias, String nTarjeta) {
		// TODO Auto-generated method stub
	}

}
