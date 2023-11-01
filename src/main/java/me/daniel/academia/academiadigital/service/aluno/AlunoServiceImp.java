package me.daniel.academia.academiadigital.service.aluno;

import me.daniel.academia.academiadigital.dto.aluno.AlunoDto;
import me.daniel.academia.academiadigital.model.Aluno;
import me.daniel.academia.academiadigital.model.AvaliacaoFisica;
import me.daniel.academia.academiadigital.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class AlunoServiceImp implements IAlunoService
{

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno createAluno(AlunoDto alunoDto) {

        Aluno aluno = new Aluno();
        aluno.setNome(alunoDto.getNome());
        aluno.setCpf(alunoDto.getCpf());
        aluno.setBairro(alunoDto.getBairro());
        aluno.setDataDeNascimento(alunoDto.getDataDeNascimento());
        alunoRepository.save(aluno);
        return aluno;
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id) {

        Optional<Aluno> aluno = alunoRepository.findById(id);

        if (!aluno.isPresent()) {
         throw new RuntimeException("Aluno não encontrado");
        }

        return aluno.get().getAvaliacoes();

    }

}

