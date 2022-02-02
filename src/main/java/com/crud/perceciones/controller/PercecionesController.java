package com.crud.perceciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.perceciones.entity.PercepsionesEntity;
import com.crud.perceciones.repository.PercepcionRepository;

@RestController
@RequestMapping("/user")
public class PercecionesController {
	@Autowired
	private PercepcionRepository interfacePercepcion;
	
	@GetMapping
	public List<PercepsionesEntity> listar() {
		return (List<PercepsionesEntity>) interfacePercepcion.findAll();
	}
	@PostMapping
	public void insertar(@RequestBody PercepsionesEntity us ) {
		interfacePercepcion.save(us);
	}
	@PutMapping
	public void modificar(@RequestBody PercepsionesEntity us ) {
		interfacePercepcion.save(us);
	}
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") long  id) {
		interfacePercepcion.deleteById(id);
	}
	
}
