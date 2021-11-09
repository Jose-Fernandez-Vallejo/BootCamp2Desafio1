package com.example.Desafio1;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Desafio1.Entities.Cliente;
import com.example.Desafio1.Entities.ClienteDaoI;
import com.example.Desafio1.services.ClienteServiceI;
import com.example.Desafio1.services.ClienteServiceImpl;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	ClienteServiceImpl clienteService;
	
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
		
		cliente2.setNombre("Juan");
		cliente2.setApellido1("Fernandez");
		cliente2.setApellido2("Munoz");
		cliente2.setnDocumento("43215678A");
		
		cliente3.setNombre("Alberto");
		cliente3.setApellido1("Rodriguez");
		cliente3.setApellido2("Vallejo");
		cliente3.setnDocumento("12345278A");
		
		clienteService.insert(cliente1);
		clienteService.insert(cliente2);
		clienteService.insert(cliente3);
		
		
	for (Iterator iterator = clienteService.searchAll().iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
			
			System.out.println("id cliente:  " + cliente.getId() + " nombre: " + cliente.getNombre()+ " Apellidos:" +cliente.getApellido1()+" " + cliente.getApellido2());
			
		}
	
		cliente3.setApellido2("Valle");
		cliente3.setId((long) 3);
		
		clienteService.Update(cliente3);
		
		
		
		Cliente clienteTmp = clienteService.searchById(cliente3.getId());
		
		
		System.out.println("id cliente:  " + clienteTmp.getId() + " nombre: " + clienteTmp.getNombre()+ " Apellidos:" +clienteTmp.getApellido1()+" " + clienteTmp.getApellido2());
		
		
		
		
		
		
	}

}
