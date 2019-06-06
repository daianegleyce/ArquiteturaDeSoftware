package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Livro;

public interface LivroRepository extends JpaRepository <Livro, Long>{
	
}