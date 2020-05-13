package com.formaciondbi.springboot.app.items.models.service;

import com.fomaciondb.springboot.app.commons.models.entity.Producto;
import com.formaciondbi.springboot.app.items.clientes.ProductoClientesRest;
import com.formaciondbi.springboot.app.items.models.Item;
import com.formaciondbi.springboot.app.items.models.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("serviceFeign")
@Primary
public class ItemServiceFeign implements ItemService {

    @Autowired
    private ProductoClientesRest clienteFeign;

    @Override
    public List<Item> findAll() {
        return clienteFeign.listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        return new Item(clienteFeign.detalle(id), cantidad);
    }

    @Override
    public Producto save(Producto producto) {
        return clienteFeign.crear(producto);
    }

    @Override
    public Producto update(Producto producto, Long id) {
        return clienteFeign.update(producto, id);
    }

    @Override
    public void delete(Long id) {
        clienteFeign.eliminar(id);
    }
}
