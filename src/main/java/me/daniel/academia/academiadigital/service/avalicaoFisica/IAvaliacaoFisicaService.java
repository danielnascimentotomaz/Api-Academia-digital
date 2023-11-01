package me.daniel.academia.academiadigital.service.avalicaoFisica;

import me.daniel.academia.academiadigital.dto.avaliacaoFisica.AvaliacaoFisicaDto;
import me.daniel.academia.academiadigital.model.AvaliacaoFisica;

import java.util.List;

public interface IAvaliacaoFisicaService {

    AvaliacaoFisica create(AvaliacaoFisicaDto avaliacaoDto) throws Exception;

    List<AvaliacaoFisica> getAll();





}
