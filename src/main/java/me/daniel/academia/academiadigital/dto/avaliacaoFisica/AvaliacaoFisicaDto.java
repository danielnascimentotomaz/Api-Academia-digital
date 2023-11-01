package me.daniel.academia.academiadigital.dto.avaliacaoFisica;

public class AvaliacaoFisicaDto {

    private double peso;

    private double altura;

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
