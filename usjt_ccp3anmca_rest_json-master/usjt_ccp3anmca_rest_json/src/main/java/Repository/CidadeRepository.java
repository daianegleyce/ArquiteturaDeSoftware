package Repository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import Model.Cidade;

public interface CidadeRepository extends JpaRepository  <Cidade, Long>{
	
	@Async
	public Future <Cidade> findAll (String nomeCidade);
	
	@Query ("SELECT cid FROM Cidade cid WHERE cid.nomeCidade = LIKE 'a%' ")
	public List <Cidade> buscarPorLetra (@Param ("nomeCidade") String nomeCidade);
	
	@Query ("SELECT cid FROM Cidade cid WHERE latitude = :latitude AND longitude = :longitude")
	public List <Cidade> buscaPorLatitudeELongitude ( @Param ("Latitude" ) int latitude,
			                                          @Param ("Longitude") int longitude);

}
