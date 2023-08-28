package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.model.Formulario;
import com.example.demo.service.IFormularioService;

@RestController
@RequestMapping("/formularios")
@CrossOrigin
public class FormularioControllerRestFul {

	
    @Autowired
    private IFormularioService formularioService;
    
    @GetMapping
    public List<Formulario> obtenerTodos(){
        return this.formularioService.buscarTodos();
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Formulario> obtenerForo(@PathVariable Integer id){
        var formulario = this.formularioService.buscarID(id);
        return new ResponseEntity<>(formulario, null,200);
    }
    @PostMapping
    public ResponseEntity<Formulario> postear(@RequestBody Formulario formulario){
        this.formularioService.insertar(formulario);
        return new ResponseEntity<>(formulario,null,200);
    }
}
