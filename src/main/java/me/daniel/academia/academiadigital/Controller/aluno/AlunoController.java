package me.daniel.academia.academiadigital.Controller.aluno;

import jakarta.validation.Valid;
import me.daniel.academia.academiadigital.dto.aluno.AlunoDto;
import me.daniel.academia.academiadigital.model.Aluno;
import me.daniel.academia.academiadigital.model.AvaliacaoFisica;
import me.daniel.academia.academiadigital.service.aluno.AlunoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImp alunoService;


    @PostMapping
    public ResponseEntity<Aluno> createAluno(@Valid @RequestBody AlunoDto alunoDto) {

        Aluno aluno = alunoService.createAluno(alunoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(aluno);
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> getAllAlunos() {

        return ResponseEntity.status(HttpStatus.OK).body(alunoService.getAllAlunos());
    }

    @GetMapping("avaliacoes/{id}")
    public ResponseEntity<List<AvaliacaoFisica>> getAllAlunosAvaliacoes(@PathVariable Long id) {

        List<AvaliacaoFisica> avaliacoes = alunoService.getAllAvaliacaoFisica(id);
        return ResponseEntity.status(HttpStatus.OK).body(avaliacoes);

    }

    @GetMapping("/{dataNascimento}")
    public ResponseEntity<List<Aluno>> getAlunosByDataNascimento(@PathVariable String dataNascimento) {

      List<Aluno> alunos = alunoService.getAllAlunosByDataDeNascimento(dataNascimento);

      return ResponseEntity.status(HttpStatus.OK).body(alunos);

    }


}
