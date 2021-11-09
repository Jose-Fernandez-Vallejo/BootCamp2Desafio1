package com.example.Desafio1.Entities;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ContratoDaoImpl implements ContratoDaoI {
	@Autowired
	EntityManager manager;

	@Override
	public void insert(Contrato contrato) {
Session session = manager.unwrap(Session.class);
		
		
		session.save(contrato);
		
		session.close();
		
	}

	@Override
	public List<Contrato> searchAll() {
		Session session = manager.unwrap(Session.class);
		
		List<Contrato> lista = session.createQuery("FROM Contrato").getResultList();
		
		session.close();
		return lista;
	}

	@Override
	public Contrato searchById(Long idContrato) {
		Session session = manager.unwrap(Session.class);
		
		Contrato contrato = (Contrato) session.createQuery("FROM Contrato WHERE ID_CONTRATO =" + idContrato).uniqueResult();
		
		session.close();
		return contrato;
	}

	@Override
	public List<Contrato> searchByCliente(Long idCliente) {
		Session session = manager.unwrap(Session.class);
		
List<Contrato> lista = session.createQuery("FROM Contrato where ID_CLIENTE = " + idCliente).getResultList();
		
		session.close();
		return lista;
	}

	@Override
	public void delete(Contrato contrato) {
		
	Session session = manager.unwrap(Session.class);
		
		manager.remove(manager.merge(contrato));
		
		session.close();
		
	}

	@Override
	public void Update(Contrato contrato) {
	Session session = manager.unwrap(Session.class);
		
		
		session.saveOrUpdate(contrato);
		
		session.close();
		
	}
}
