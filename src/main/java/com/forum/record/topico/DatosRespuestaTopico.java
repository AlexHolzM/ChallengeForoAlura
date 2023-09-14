package com.forum.record.topico;

import java.time.LocalDateTime;

import com.forum.model.StatusTopico;

public record DatosRespuestaTopico(
                Long id,
                String titulo,
                String mensaje,
                LocalDateTime fechaCreacion,
                StatusTopico estado,
                Long autor,
                Long curso) {

}