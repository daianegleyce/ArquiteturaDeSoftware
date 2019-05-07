package br.usjt.previsoes.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name="tb_cidade")
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "cidade")
    private List<Previsao> previsao;

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private double latitude;
    private double longitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public List<Previsao> getPrevisao() {
        return previsao;
    }

    public void setPrevisao(List<Previsao> previsao) {
        this.previsao = previsao;
    }
}