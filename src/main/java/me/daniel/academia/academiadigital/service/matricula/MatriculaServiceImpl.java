package me.daniel.academia.academiadigital.service.matricula;

import me.daniel.academia.academiadigital.dto.matricula.MatriculaDto;
import me.daniel.academia.academiadigital.model.Aluno;
import me.daniel.academia.academiadigital.model.Matricula;
import me.daniel.academia.academiadigital.repository.AlunoRepository;
import me.daniel.academia.academiadigital.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;


    @Override
    public Matricula create(MatriculaDto matriculaDto) {

        Optional<Aluno> aluno = alunoRepository.findById(matriculaDto.getIdAluno());


        //todo verificar se o aluno existe uma matricula




        if(!aluno.isPresent()){

            throw new RuntimeException("Aluno não encontrado");
        }


        Matricula matricula = new Matricula();

        matricula.setAluno(aluno.get());


        return matriculaRepository.save(matricula);



    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }
}
