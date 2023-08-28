package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Formulario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class FormularioRepositoryImpl implements IFormularioRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Formulario formulario) {
		this.entityManager.persist(formulario);
		
	}

	@Override
	public List<Formulario> buscarTodos() {
		TypedQuery<Formulario> myQuery=this.entityManager.createQuery("SELECT f FROM Formulario f", Formulario.class);
        return myQuery.getResultList();
	}

	@Override
	public Formulario buscarID(Integer id) {
		return this.entityManager.find(Formulario.class, id);
	}

}
