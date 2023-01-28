package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Automovil;
import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.modelo.Pago;
import com.example.demo.uce.modelo.Renta;
import com.example.demo.uce.service.IAutomovilService;
import com.example.demo.uce.service.IRentaService;

@SpringBootApplication
public class EjercicioU2PaP3JaApplication implements CommandLineRunner {
	@Autowired
	private IAutomovilService iAutomovilService;
	@Autowired
	private IRentaService iRentaService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU2PaP3JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Automovil auto = new Automovil();
		auto.setPlaca("PCO123");
		auto.setValorDia(new BigDecimal(200));
		Cliente cliente = new Cliente();
		cliente.setCedula("1727501510");
		cliente.setNombre("Jhonatan");
		Pago pago = new Pago();
		
		//String placa, String cedula, BigDecimal nDias, String nTarjeta
		Renta renta = new Renta();
		renta.setNumeroTarjeta("123456789");
	
		this.iRentaService.realizarRenta("PCO123","172750150", new BigDecimal(15),"123456789");
		
		
		
		
	}

}
