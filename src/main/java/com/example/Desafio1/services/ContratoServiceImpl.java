package com.example.Desafio1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Desafio1.Entities.ClienteDaoI;
import com.example.Desafio1.Entities.Contrato;
import com.example.Desafio1.Entities.ContratoDaoI;

@Service
public class ContratoServiceImpl implements ContratoServiceI {

	@Autowired
	ContratoDaoI contratoDao;
	
	@Override
	public void insert(Contrato contrato) {
		contratoDao.insert(contrato);
		
	}

	@Override
	public List<Contrato> searchAll() {
		// TODO Auto-generated method stub
		return contratoDao.searchAll();
	}

	@Override
	public Contrato searchById(Long idContrato) {

		return contratoDao.searchById(idContrato);
	}

	@Override
	public List<Contrato> searchByCliente(Long idCliente) {

		return contratoDao.searchByCliente(idCliente);
	}

	@Override
	public void delete(Contrato contrato) {
		contratoDao.delete(contrato);
	}

	@Override
	public void Update(Contrato contrato) {
		contratoDao.Update(contrato);
		
	}

}
