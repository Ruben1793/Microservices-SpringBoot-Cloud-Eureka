package com.formaciobdi.springboot.app.productos.models.service;

import com.formaciobdi.springboot.app.productos.models.entity.Producto;

import java.util.List;

public interface IProductoService {

    public List<Producto> findAll();

    public Producto findById(Long id);
}
