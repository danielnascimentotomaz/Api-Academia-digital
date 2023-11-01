package me.daniel.academia.academiadigital.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

    private double peso;
    private double altura;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;


    public AvaliacaoFisica() {
    }

    public AvaliacaoFisica(Long id, LocalDateTime dataDaAvaliacao, double peso, double altura, Aluno aluno) {
        this.id = id;
        this.dataDaAvaliacao = dataDaAvaliacao;
        this.peso = peso;
        this.altura = altura;
        this.aluno = aluno;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public LocalDateTime getDataDaAvaliacao() {
        return dataDaAvaliacao;
    }

    public void setDataDaAvaliacao(LocalDateTime dataDaAvaliacao) {
        this.dataDaAvaliacao = dataDaAvaliacao;
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


    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }


}
