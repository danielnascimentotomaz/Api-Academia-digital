package me.daniel.academia.academiadigital.repository;

import me.daniel.academia.academiadigital.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;


public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    /*
    O Spring Data JPA reconhecerá automaticamente esse método e criará uma consulta
    SQL apropriada para buscar os registros que atendem ao critério da data de nasci-
    mento.
     */


    //@NamedQuery
    List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);


    ////////// 0u /////////////



    /*

    //@NativeQuery

    @Query("SELECT a FROM Aluno a WHERE a.dataDeNascimento = :dataDeNascimento")
    List<Aluno> findByDataDeNascimento(@Param("dataDeNascimento") LocalDate dataDeNascimento);


     */

}


