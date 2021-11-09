package com.example.Desafio1.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Desafio1.Entities.Cliente;
import com.example.Desafio1.Entities.ClienteDaoI;

@Repository
public class ClienteServiceImpl implements ClienteServiceI {

	@Autowired
	ClienteDaoI clienteDao;
	
	
	@Override
	@Transactional
	public void insert(Cliente cliente) {
		
		clienteDao.insert(cliente);
		
	}

	@Override
	@Transactional
	public List<Cliente> searchAll() {
		
	
		return clienteDao.searchAll();
	}

	@Override
	@Transactional
	public Cliente searchById(Long idCliente) {

		return clienteDao.searchById(idCliente);
	}

	@Override
	@Transactional
	public void delete(Cliente cliente) {
		
	clienteDao.delete(cliente);
	}

	@Override
	@Transactional
	public void Update(Cliente cliente) {
	clienteDao.Update(cliente);
		
	}
}
