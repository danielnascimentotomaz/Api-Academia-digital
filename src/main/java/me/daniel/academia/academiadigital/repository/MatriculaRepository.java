package me.daniel.academia.academiadigital.repository;

import me.daniel.academia.academiadigital.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<Matricula, Long>
{

    List<Matricula> findByAlunoBairro(String bairro);
}
