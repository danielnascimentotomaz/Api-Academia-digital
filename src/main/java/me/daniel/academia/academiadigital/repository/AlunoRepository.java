package me.daniel.academia.academiadigital.repository;

import me.daniel.academia.academiadigital.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AlunoRepository extends JpaRepository<Aluno, Long>
{

}
