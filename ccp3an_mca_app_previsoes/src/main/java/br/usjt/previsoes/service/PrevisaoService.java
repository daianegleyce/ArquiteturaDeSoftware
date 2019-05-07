package br.usjt.previsoes.service;

import br.usjt.previsoes.model.Previsao;
import br.usjt.previsoes.model.repository.PrevisaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrevisaoService {
    @Autowired
    private PrevisaoRepository previsaoRepo;

    public List<Previsao> listar(){
        List<Previsao> previsoes = previsaoRepo.findAll();
        return previsoes;
    }
}
