package com.forum.record.topico;

import com.forum.model.StatusTopico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
                @NotBlank String titulo,
                @NotBlank String mensaje,
                @NotNull StatusTopico estado,
                @NotNull Long autor,
                @NotNull Long curso) {

}