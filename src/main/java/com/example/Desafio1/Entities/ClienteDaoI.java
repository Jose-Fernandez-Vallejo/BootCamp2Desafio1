package com.example.Desafio1.Entities;

import java.util.List;

public interface ClienteDaoI {
	
	public void insert(Cliente cliente);
	public List<Cliente> searchAll();
	public Cliente searchById(Long idCliente);
	public void delete(Cliente Cliente);
	public void Update(Cliente cliente);
	

}
