package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IFormularioRepository;
import com.example.demo.repository.model.Formulario;

@Service
public class FormularioServiceImpl implements IFormularioService{
	
    @Autowired
    private IFormularioRepository formularioRepository;

	@Override
	public void insertar(Formulario formulario) {
		this.formularioRepository.insertar(formulario);
	}

	@Override
	public List<Formulario> buscarTodos() {
		return this.formularioRepository.buscarTodos();
	}

	@Override
	public Formulario buscarID(Integer id) {
		return this.formularioRepository.buscarID(id);
	}

}
