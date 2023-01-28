package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

import com.example.demo.uce.modelo.Automovil;
import com.example.demo.uce.repository.IAutomovilRepo;

public class AutomovilServiceImpl implements IAutomovilService {
	@Autowired
	private IAutomovilRepo iAutomovilRepo;
	@Override
	public void crear(Automovil automovil) {
		// TODO Auto-generated method stub
		iAutomovilRepo.insertar(automovil);
	}

	@Override
	public Automovil buscar(String placa) {
		// TODO Auto-generated method stub
		return iAutomovilRepo.buscar(placa);
	}

}
