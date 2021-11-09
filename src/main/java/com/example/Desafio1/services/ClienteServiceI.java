package com.example.Desafio1.services;

import java.util.List;

import com.example.Desafio1.Entities.Cliente;

public interface ClienteServiceI {
	public void insert(Cliente cliente);
	public List<Cliente> searchAll();
	public Cliente searchById(Long idCliente);
	public void delete(Cliente Cliente);
	public void Update(Cliente cliente);

}
