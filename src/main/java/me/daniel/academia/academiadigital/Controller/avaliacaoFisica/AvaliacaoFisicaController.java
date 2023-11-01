package me.daniel.academia.academiadigital.Controller.avaliacaoFisica;

import me.daniel.academia.academiadigital.dto.avaliacaoFisica.AvaliacaoFisicaDto;
import me.daniel.academia.academiadigital.model.AvaliacaoFisica;
import me.daniel.academia.academiadigital.service.avalicaoFisica.AvaliacaoFisicaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl avaliacaoFisicaService;

    @PostMapping
    public ResponseEntity<AvaliacaoFisica> create(@RequestBody AvaliacaoFisicaDto avaliacaoFisicaDto) throws Exception {

        return ResponseEntity.status(HttpStatus.CREATED).body(avaliacaoFisicaService.create(avaliacaoFisicaDto));

    }

}