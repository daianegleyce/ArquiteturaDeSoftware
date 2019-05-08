package br.usjt.previsoes.resource;

import br.usjt.previsoes.model.Cidade;
import br.usjt.previsoes.model.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;
import java.util.Map;

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
    @GetMapping("/{latitude}/{longitude}")
    public Cidade controllerMethod(@PathVariable double latitude, @PathVariable double longitude) {
        return cidadeRepo.findByLatitudeAndLongitude(latitude, longitude);
    }
    @PostMapping ("/salvar")
    public ResponseEntity<Cidade> salvar (@RequestBody Cidade cidade, HttpServletResponse
            response) {
        Cidade c = cidadeRepo.save(cidade);
        URI uri = ServletUriComponentsBuilder.
                fromCurrentServletMapping().path("/{id}").
                buildAndExpand(c.getId()).
                toUri();
        return ResponseEntity.created(uri).body(c);
    }
}