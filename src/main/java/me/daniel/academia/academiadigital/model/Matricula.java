package me.daniel.academia.academiadigital.model;

import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "tb_matriculas")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataDaMatricula = LocalDateTime.now();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    /*
     * @OneToOne indica que há uma relação de um para um entre as entidades
     *
     * @JoinColumn especifica a coluna na tabela do banco de dados que será usada
     * para mapear a associação, com um nome de coluna "aluno_id".
     *
     *CascadeType.ALL indica que todas as operações de persistência (inserção, atualização e
     * exclusão) na classe atual devem ser aplicadas à entidade associada.
     *
     *


     */



    public Matricula() {

    }

    public Matricula(Long id, LocalDateTime dataDaMatricula, Aluno aluno) {
        this.id = id;
        this.dataDaMatricula = dataDaMatricula;
        this.aluno = aluno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataDaMatricula() {
        return dataDaMatricula;
    }

    public void setDataDaMatricula(LocalDateTime dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
