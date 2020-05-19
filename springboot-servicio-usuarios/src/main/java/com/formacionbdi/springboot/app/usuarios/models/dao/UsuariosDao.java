package com.formacionbdi.springboot.app.usuarios.models.dao;

import com.formacionbdi.springboot.app.usuarios.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsuariosDao extends PagingAndSortingRepository<Usuario, Long> {

    public Usuario findByUsername(String username);

    @Query("select u from Usuario u where u.username = ?1")
    public Usuario obtenerPorUsuario(String username);
}
