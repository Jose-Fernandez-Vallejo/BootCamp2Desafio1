package com.example.Desafio1;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Desafio1.Entities.Cliente;
import com.example.Desafio1.Entities.ClienteDaoI;
import com.example.Desafio1.Entities.Contrato;
import com.example.Desafio1.services.ClienteServiceI;
import com.example.Desafio1.services.ClienteServiceImpl;
import com.example.Desafio1.services.ContratoServiceI;
import com.example.Desafio1.services.ContratoServiceImpl;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	ClienteServiceImpl clienteService;
	
	@Autowired
	ContratoServiceImpl contratoService;
	
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
		
		 Date date1 =  new GregorianCalendar(2014, Calendar.FEBRUARY, 10).getTime();
		 Date date2 =  new GregorianCalendar(2015, Calendar.OCTOBER, 21).getTime();
		
		
		Contrato contrato1 = new Contrato();
		Contrato contrato2 = new Contrato();
		Contrato contrato3 = new Contrato();
		
		contrato1.setFechaVigencia(date1);
		contrato1.setFechaCaducidad(date2);
		contrato1.setPrecio(222.22);
		contrato1.setCliente(cliente1);
		
		contrato2.setFechaVigencia(date1);
		contrato2.setFechaCaducidad(date2);
		contrato2.setPrecio(822.22);
		contrato2.setCliente(cliente1);
		
		contrato3.setFechaVigencia(date1);
		contrato3.setFechaCaducidad(date2);
		contrato3.setPrecio(523.42);
		contrato3.setCliente(cliente2);
		
		List<Contrato> listaContrato1 = new ArrayList<>();
		listaContrato1.add(contrato1);
		listaContrato1.add(contrato2);
		List<Contrato> listaContrato2 = new ArrayList<>();
		listaContrato2.add(contrato3);

		cliente1.setListaContratos(listaContrato1);
		cliente3.setListaContratos(listaContrato2);
		
		
		
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
		
		
		contratoService.delete(contrato1);
		
		
		
		
		Cliente clienteTmp = clienteService.searchById(cliente3.getId());
		Contrato contratoTmp = contratoService.searchById((long) 2);
		
		System.out.println("id cliente:  " + clienteTmp.getId() + " nombre: " + clienteTmp.getNombre()+ " Apellidos:" +clienteTmp.getApellido1()+" " + clienteTmp.getApellido2());
		
		System.out.println("id contrato:  " + contratoTmp.getId() + " fecha Vigencia: " + contratoTmp.getFechaVigencia().toString());


		
		
		
		
		
	}

}
