package me.daniel.academia.academiadigital.Controller.aluno;

import me.daniel.academia.academiadigital.dto.aluno.AlunoDto;
import me.daniel.academia.academiadigital.model.Aluno;
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
    public ResponseEntity<Aluno> createAluno(@RequestBody AlunoDto alunoDto) {

        Aluno aluno = alunoService.createAluno(alunoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(aluno);
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> getAllAlunos() {

        return ResponseEntity.status(HttpStatus.OK).body(alunoService.getAllAlunos());
    }


}
