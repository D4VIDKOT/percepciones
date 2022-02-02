package com.crud.perceciones.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="percepciones")
public class PercepsionesEntity  {

	
	@Id
	@Column

	private Long id;
	@Column
	private String nombre;
	@Column
	private String correo;
	@Column
	private String telefono;
	@Column
	private String cafe;
	@Column
	private String percepcion;
	@Column
	private String estado;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCafe() {
		return cafe;
	}
	public void setCafe(String cafe) {
		this.cafe = cafe;
	}
	public String getPercepcion() {
		return percepcion;
	}
	public void setPercepcion(String percepcion) {
		this.percepcion = percepcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
