package com.example.demo.service;

import com.example.demo.repository.model.Noticia;
import com.example.demo.service.to.NoticiaTO;

import java.util.List;

public interface INoticiaService {
    public void create(Noticia noticia);
    public NoticiaTO read(Integer id);
    public List<NoticiaTO>readAll();
}
