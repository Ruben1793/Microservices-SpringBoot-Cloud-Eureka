package com.formaciobdi.springboot.app.productos.models.service;

import com.fomaciondb.springboot.app.commons.models.entity.Producto;

import java.util.List;

public interface IProductoService {

    public List<Producto> findAll();

    public Producto findById(Long id);

    public Producto save(Producto producto);

    public void deleteById(long id );
}
