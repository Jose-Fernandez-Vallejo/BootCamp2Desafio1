package com.example.Desafio1.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "CLIENTE")
public class Cliente {

	Long id;
	
	String nombre;
	
	String apellido1;
	
	String apellido2;
	
	String nDocumento;
	
	List<Contrato> listaContratos;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLIENTE", precision = 10)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "NOMBRE", nullable = false, length = 50)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column(name = "APELLIDO1", nullable = false, length = 50)
	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido) {
		this.apellido1 = apellido;
	}
	@Column(name = "APELLIDO2", nullable = false, length = 50)
	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	@Column(name = "NDOCUMENTO", nullable = false,unique = true, length = 9)
	public String getnDocumento() {
		return nDocumento;
	}

	public void setnDocumento(String nDocumento) {
		this.nDocumento = nDocumento;
	}


	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public List<Contrato> getListaContratos() {
		return listaContratos;
	}

	public void setListaContratos(List<Contrato> listaContratos) {
		this.listaContratos = listaContratos;
	}

	
	
}
