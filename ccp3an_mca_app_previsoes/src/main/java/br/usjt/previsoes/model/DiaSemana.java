package br.usjt.previsoes.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_dia_semana")
public class DiaSemana {

    @OneToOne(mappedBy = "diaSemana")
    private Previsao previsao;

    @Id
    @GeneratedValue
    private Long id;

    private String diaSemana;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Previsao getPrevisao() {
        return previsao;
    }

    public void setPrevisao(Previsao previsao) {
        this.previsao = previsao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DiaSemana other = (DiaSemana) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}