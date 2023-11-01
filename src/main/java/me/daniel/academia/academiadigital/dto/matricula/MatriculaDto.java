package me.daniel.academia.academiadigital.dto.matricula;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class MatriculaDto {

    @NotNull(message = "O Id do aluno não pode ser nulo.")
    @Positive(message = "O Id do aluno precisa ser positivo.")
    private Long IdAluno;


    public MatriculaDto() {

    }


    public MatriculaDto(Long idAluno) {
        IdAluno = idAluno;
    }

    public Long getIdAluno() {
        return IdAluno;
    }

    public void setIdAluno(Long idAluno) {
        IdAluno = idAluno;
    }
}
