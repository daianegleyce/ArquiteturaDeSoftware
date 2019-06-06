package Controller;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import Model.Livro;
import Repository.LivroRepository;

@RestController
public class LivroResource {

	@Autowired
	private LivroRepository livroRepo;

	@GetMapping("/lista")
	public List<Livro> todosOsLivros() {
		return livroRepo.findAll();
	}

	
	@PostMapping("/salvar")
	public void salvar(@RequestBody Livro livro) {
		livroRepo.save(livro);
	}

	
	@PostMapping("/salvar")
	@ResponseStatus(HttpStatus.CREATED)
	public void salvar2(@RequestBody Livro livro) {
		livroRepo.save(livro);
	}
	

	@PostMapping("/salvar")
	@ResponseStatus(HttpStatus.CREATED)
	public void salvar3(@RequestBody Livro livro, HttpServletResponse response) {
		Livro l = livroRepo.save(livro);
		URI uri = ServletUriComponentsBuilder.fromCurrentServletMapping().path("/{id}").buildAndExpand(l.getId())
				.toUri();
		response.setHeader("Location", uri.toASCIIString());
	}

	
	@PostMapping("/salvar")
	// @ResponseStatus (HttpStatus.CREATED) agora desnecessária
	public ResponseEntity<Livro> salvar4(@RequestBody Livro livro, HttpServletResponse response) {
		Livro l = livroRepo.save(livro);
		URI uri = ServletUriComponentsBuilder.fromCurrentServletMapping().path("/{id}").buildAndExpand(l.getId()).toUri();
		// desnecessário também
		// response.setHeader("Location", uri.toASCIIString());
		return ResponseEntity.created(uri).body(l);
	}
	

	@GetMapping("/{id}")
	public Livro buscarPeloId(@PathVariable Long id) {
		return livroRepo.getOne(id);
	}
	
	
}