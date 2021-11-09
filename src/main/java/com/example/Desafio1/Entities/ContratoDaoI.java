package com.example.Desafio1.Entities;

import java.util.List;

public interface ContratoDaoI {
	
	public void insert(Contrato contrato);
	public List<Contrato> searchAll();
	public Contrato searchById(Long idContrato);
	public List<Contrato> searchByCliente(Long idCliente);
	public void delete(Contrato contrato);
	public void Update(Contrato contrato);

}
