package Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idCidade;
	
	@Column(name = "nomeCidade", nullable = false)
	private String nomeCidade;
	
	@Column(name = "latitude", nullable = false)
	private double latitude;
	
	@Column(name = "longitudde", nullable = false)
	private double longitude;

	public Cidade(Long idCidade, String nomeCidade, double latitude, double longitude) {
		super();
		this.idCidade = idCidade;
		this.nomeCidade = nomeCidade;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Long getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	


}
