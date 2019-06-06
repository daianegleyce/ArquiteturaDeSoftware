package Controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import javax.management.relation.RelationNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Model.Cidade;
import Repository.CidadeRepository;

@RestController
@RequestMapping("/Cidade")
public class CidadeResource {

	@Autowired
	private CidadeRepository cidadeRep;

	// Listar todas as Cidades.
	@GetMapping("/listaCidade")
	public List<Cidade> todasCidades() {
		return cidadeRep.findAll();
	}

	// Listar todas as Cidades por letra inicial.
	@GetMapping("/listaPorNome")
	public List<Cidade> todasCidadesPorLetra() {
		return cidadeRep.buscarPorLetra("");
	}

	// Obter uma cidade por sua latitude e longitude.
	@GetMapping("/listaPorLatLon")
	public List<Cidade> buscaPorLatitudeELongitude() {
		return cidadeRep.buscaPorLatitudeELongitude(5, 6);
	}

	
	// Criando/Cadastrando nova Cidade
	@PostMapping
	public Cidade novaCidade(@RequestBody Cidade cidade){
	   return CidadeRepository.save(cidade);
	}

	

}
