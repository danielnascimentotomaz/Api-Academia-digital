package me.daniel.academia.academiadigital.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // Ignora as propriedades "hibernateLazyInitializer" e "handler" do objeto.
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @Column(unique = true)
    private String cpf;
    private String bairro;
    private LocalDate dataDeNascimento;


    @OneToMany(mappedBy = "aluno", cascade = CascadeType.REMOVE , fetch = FetchType.LAZY)
    @JsonIgnore
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

    /*
    @OneToMany: Essa anotação indica que existe uma relação de um para muitos entre
    a classe atual (onde você colocou essa anotação) e a classe referenciada.


    mappedBy = "aluno": Isso define o nome do atributo na classe associada que mantém a
    referência à classe atual. Em outras palavras, "aluno" é o nome do campo na classe
    referenciada que faz referência a objetos desta classe.


    cascade = CascadeType.REMOVE: Isso indica que, quando uma entidade "aluno" é removida,
    todas as entidades associadas (definidas na relação OneToMany) também serão removidas
    automaticamente. É uma estratégia de cascata.


    fetch = FetchType.LAZY: Define a estratégia de carregamento dos dados associados. Neste caso,
    os dados associados (entidades relacionadas) serão carregados apenas quando forem acessados,
    o que pode melhorar o desempenho ao evitar o carregamento desnecessário de dados.


     */








    public Aluno() {

    }


    public Aluno(Long id, String nome, String cpf, String bairro, LocalDate dataDeNascimento, List<AvaliacaoFisica> avaliacoes) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.bairro = bairro;
        this.dataDeNascimento = dataDeNascimento;
        this.avaliacoes = avaliacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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



    public List<AvaliacaoFisica> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<AvaliacaoFisica> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}