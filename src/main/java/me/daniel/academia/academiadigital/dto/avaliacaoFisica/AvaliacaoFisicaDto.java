package me.daniel.academia.academiadigital.dto.avaliacaoFisica;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class AvaliacaoFisicaDto {
    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "O campo peso precisa ser positivo.")
    private double peso;


    @Positive(message = "O campo altura precisa ser positivo.")
    @NotNull(message = "Preencha o campo corretamente.")
    private double altura;
    @Positive(message = "O Id do aluno precisa ser positivo.")
    private int idAluno;

    public AvaliacaoFisicaDto( double peso, double altura, int idAluno) {

        this.peso = peso;
        this.altura = altura;
        this.idAluno = idAluno;
    }

    public AvaliacaoFisicaDto() {
    }



    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
}
