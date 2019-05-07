package br.usjt.previsoes.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Previsao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    @JoinColumn(name = "id_dia_semana")
    private DiaSemana diaSemana;
    @ManyToOne
    @JoinColumn(name="id_cidade")
    private Cidade cidade;
    private Double temperaturaMinima;
    private Double temperaturaMaxima;
    private Double humidadeAr;
    private String descricao;
    private String dataHora;
    private Double latitude;
    private Double longitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Cidade getCidade() { return cidade; }

    public void setCidade(Cidade cidade) { this.cidade = cidade; }

    public Double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(Double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public Double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(Double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Double getHumidadeAr() {
        return humidadeAr;
    }

    public void setHumidadeAr(Double humidadeAr) {
        this.humidadeAr = humidadeAr;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
