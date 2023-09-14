package com.forum.record.topico;

import com.forum.model.StatusTopico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
                @NotNull Long id,
                String titulo,
                String mensaje,
                StatusTopico estado,
                Long autor,
                Long curso) {

}
