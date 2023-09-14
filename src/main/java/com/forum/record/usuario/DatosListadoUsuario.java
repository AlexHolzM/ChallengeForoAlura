package com.forum.record.usuario;

import com.forum.model.Usuario;

public record DatosListadoUsuario(Long id, String nombre, String email) {

    public DatosListadoUsuario(Usuario usuario) {
        this(usuario.getUsuarioId(), usuario.getNombre(), usuario.getEmail());
    }

}