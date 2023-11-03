package me.daniel.academia.academiadigital.Controller.matricula;


import jakarta.validation.Valid;
import me.daniel.academia.academiadigital.dto.matricula.MatriculaDto;
import me.daniel.academia.academiadigital.model.Matricula;
import me.daniel.academia.academiadigital.service.matricula.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl matriculaService;

    @PostMapping
    public ResponseEntity<Matricula> create(@Valid @RequestBody MatriculaDto matriculaDto) {
        Matricula matricula = matriculaService.create(matriculaDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(matricula);
    }

    @GetMapping
    public ResponseEntity<List<Matricula>> getAll() {

        return ResponseEntity.ok(matriculaService.getAll());
    }


    @GetMapping("/{bairro}")
    public ResponseEntity<List<Matricula> >getById(@PathVariable String  bairro) {
        return ResponseEntity.status(HttpStatus.OK).body(matriculaService.getAllAlunoByBairro(bairro));
    }




}
