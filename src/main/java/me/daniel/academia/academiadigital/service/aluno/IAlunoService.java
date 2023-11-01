package me.daniel.academia.academiadigital.service.aluno;

import me.daniel.academia.academiadigital.dto.aluno.AlunoDto;
import me.daniel.academia.academiadigital.model.Aluno;
import me.daniel.academia.academiadigital.model.AvaliacaoFisica;

import java.util.List;

public interface IAlunoService {

    List<Aluno> getAllAlunos();

    Aluno createAluno(AlunoDto alunoDto);

    List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id);






}
