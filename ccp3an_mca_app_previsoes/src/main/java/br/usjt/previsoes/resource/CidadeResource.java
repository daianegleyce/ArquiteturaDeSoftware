package br.usjt.previsoes.resource;

import br.usjt.previsoes.model.Cidade;
import br.usjt.previsoes.model.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidade")
public class CidadeResource {
    @Autowired
    private CidadeRepository cidadeRepo;
    @GetMapping("/lista")
    public List<Cidade> todasCidades(){
        return cidadeRepo.findAll();
    }
    @GetMapping ("/{letra}")
    public List<Cidade> comecaComLetra(@PathVariable String letra) {
        return cidadeRepo.buscarPorLetraInicial(letra);
    }
}
