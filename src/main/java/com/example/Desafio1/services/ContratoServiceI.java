package com.example.Desafio1.services;

import java.util.List;

import com.example.Desafio1.Entities.Contrato;

public interface ContratoServiceI {

	public void insert(Contrato contrato);
	public List<Contrato> searchAll();
	public Contrato searchById(Long idContrato);
	public List<Contrato> searchByCliente(Long idCliente);
	public void delete(Contrato contrato);
	public void Update(Contrato contrato);
}
