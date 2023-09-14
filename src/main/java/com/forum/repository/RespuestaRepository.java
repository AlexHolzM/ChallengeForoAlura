package com.forum.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.forum.model.Respuesta;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {

    @Query("SELECT R FROM Respuesta R WHERE R.topico.topicoId=:topico")
    Page<Respuesta> buscarPorTopico(Long topico, Pageable paginacion);

    @Query("SELECT R FROM Respuesta R WHERE R.autor.usuarioId=:autor")
    Page<Respuesta> buscarPorAutor(Long autor, Pageable paginacion);

}
