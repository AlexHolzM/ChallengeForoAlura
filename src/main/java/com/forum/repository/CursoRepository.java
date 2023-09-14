package com.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
