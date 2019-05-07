package br.usjt.previsoes.model.repository;

import br.usjt.previsoes.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    List<Cidade> findByLatitudeAndLongitude(double latitude, double longitude);

    List<Cidade> findByNome(String nome);

    List<Cidade> findByNomeIgnoreCase(String nome);

    List<Cidade> findAll();

    @Query("SELECT c FROM tb_cidade c WHERE c.nome LIKE ?1%")
    List<Cidade> buscarPorLetraInicial(String letra);
}
