package com.example.Desafio1.services;

import java.util.List;

import javax.transaction.Transactional;

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
	@Transactional
	public void insert(Contrato contrato) {
		contratoDao.insert(contrato);
		
	}

	@Override
	@Transactional
	public List<Contrato> searchAll() {
		// TODO Auto-generated method stub
		return contratoDao.searchAll();
	}

	@Override
	@Transactional
	public Contrato searchById(Long idContrato) {

		return contratoDao.searchById(idContrato);
	}

	@Override
	@Transactional
	public List<Contrato> searchByCliente(Long idCliente) {

		return contratoDao.searchByCliente(idCliente);
	}

	@Override
	@Transactional
	public void delete(Contrato contrato) {
		contratoDao.delete(contrato);
	}

	@Override
	@Transactional
	public void Update(Contrato contrato) {
		contratoDao.Update(contrato);
		
	}

}
