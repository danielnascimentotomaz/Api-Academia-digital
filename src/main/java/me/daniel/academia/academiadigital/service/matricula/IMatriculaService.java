package me.daniel.academia.academiadigital.service.matricula;

import me.daniel.academia.academiadigital.dto.matricula.MatriculaDto;
import me.daniel.academia.academiadigital.model.Matricula;

import java.util.List;

public interface IMatriculaService {

    Matricula create(MatriculaDto matriculaDto);

    List<Matricula> getAll();


}
