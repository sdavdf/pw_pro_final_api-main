package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.model.Formulario;

public interface IFormularioRepository {

	
	public void insertar(Formulario formulario);
	
	public List<Formulario> buscarTodos();

	public Formulario buscarID(Integer id);
}
