package com.example.Desafio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Desafio1.Entities.Cliente;
import com.example.Desafio1.Entities.ClienteDaoI;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	ClienteDaoI clienteDao;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		
		cliente1.setNombre("Jose");
		cliente1.setApellido1("Fernandez");
		cliente1.setApellido2("Vallejo");
		cliente1.setnDocumento("12345678A");
		
		cliente1.setNombre("Juan");
		cliente1.setApellido1("Fernandez");
		cliente1.setApellido2("Munoz");
		cliente1.setnDocumento("43215678A");
		
		cliente1.setNombre("Alberto");
		cliente1.setApellido1("Rodriguez");
		cliente1.setApellido2("Vallejo");
		cliente1.setnDocumento("12345278A");
		
		clienteDao.insert(cliente1);
		clienteDao.insert(cliente2);
		clienteDao.insert(cliente3);
		
	}

}
