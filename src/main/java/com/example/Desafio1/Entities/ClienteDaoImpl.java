package com.example.Desafio1.Entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteDaoImpl implements ClienteDaoI{

	@Autowired
	EntityManager manager;
	
	
	@Override
	public void insert(Cliente cliente) {
		
		Session session = manager.unwrap(Session.class);
		
		
		session.save(cliente);
		
		session.close();
		
	}

	@Override
	public List<Cliente> searchAll() {
		
		Session session = manager.unwrap(Session.class);
		
		List<Cliente> lista = session.createQuery("FROM Cliente").getResultList();
		
		session.close();
		return lista;
	}

	@Override
	public Cliente searchById(Long idCliente) {
		Session session = manager.unwrap(Session.class);
		
		Cliente cliente = (Cliente) session.createQuery("FROM Cliente WHERE ID_CLIENTE =" + idCliente).uniqueResult();
		
		session.close();
		return cliente;
	}

	@Override
	public void delete(Cliente cliente) {
		
	Session session = manager.unwrap(Session.class);
		
		
		session.delete(cliente);;
		
		session.close();
	}

	@Override

	public void Update(Cliente cliente) {
	Session session = manager.unwrap(Session.class);
		
		
		session.saveOrUpdate(cliente);
		
		session.close();
		
	}

}
