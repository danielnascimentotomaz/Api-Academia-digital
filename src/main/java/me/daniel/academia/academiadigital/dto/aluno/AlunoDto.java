package me.daniel.academia.academiadigital.dto.aluno;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public class AlunoDto {

    @NotEmpty(message = "O  campo nome não pode ficar vazio")
    @Size(min = 3, max = 50)
    private String nome;


    @NotEmpty(message = "O campo cpf não pode ficar vazio")
    @CPF(message = "'${validatedValue}' é inválido!")
    private String cpf;

    @NotEmpty(message = "O campo bairro não pode ficar vazio")
    @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String bairro;


    @NotNull(message = "O Campo data de nascimento não pode ficar vazio")
    @Past(message = "Data '${validatedValue}' é inválida!")
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
