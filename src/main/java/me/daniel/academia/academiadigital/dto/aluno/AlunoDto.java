package me.daniel.academia.academiadigital.dto.aluno;

import java.time.LocalDate;

public class AlunoDto {

    private String nome;
    private String cpf;
    private String bairro;
    private LocalDate dataDeNascimento;


    public AlunoDto() {

    }


    public AlunoDto( String nome, String cpf, String bairro, LocalDate dataDeNascimento) {

        this.nome = nome;
        this.cpf = cpf;
        this.bairro = bairro;
        this.dataDeNascimento = dataDeNascimento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;

    }










}
