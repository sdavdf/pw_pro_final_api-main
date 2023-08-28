package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.model.Formulario;

public interface IFormularioService {
	
	
	public void insertar(Formulario formulario);
	
	public List<Formulario> buscarTodos();

	public Formulario buscarID(Integer id);

}
