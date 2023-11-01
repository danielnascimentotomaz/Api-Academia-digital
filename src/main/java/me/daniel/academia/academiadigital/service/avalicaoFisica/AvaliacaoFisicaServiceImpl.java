package me.daniel.academia.academiadigital.service.avalicaoFisica;

import me.daniel.academia.academiadigital.dto.avaliacaoFisica.AvaliacaoFisicaDto;
import me.daniel.academia.academiadigital.model.Aluno;
import me.daniel.academia.academiadigital.model.AvaliacaoFisica;
import me.daniel.academia.academiadigital.repository.AlunoRepository;
import me.daniel.academia.academiadigital.repository.AvaliacaoFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService{

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;


    @Autowired
    private AlunoRepository alunoRepository;


    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaDto avaliacaoDto) throws Exception {

        // Verificar se o aluno existe
        Aluno aluno = alunoRepository.findById(avaliacaoDto.getIdAluno()).get();

        // Se não existir,
        if(aluno == null) {
            throw new Exception("Aluno não encontrado");
        }


        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(avaliacaoDto.getPeso());
        avaliacaoFisica.setAltura(avaliacaoDto.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);

    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return avaliacaoFisicaRepository.findAll();
    }
}
