package com.forum.record.curso;

import com.forum.model.Curso;

public record DatosListadoCurso(Long id, String nombre, String categoria) {

    public DatosListadoCurso(Curso curso) {
        this(curso.getCursoId(), curso.getNombre(), curso.getCategoria());
    }

}