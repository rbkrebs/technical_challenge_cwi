package com.cwi.desafio.cwi.business.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="TB_PAUTA")
public class Pauta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pauta_id;


    @NotNull
    private String descricaoPauta;

    public Pauta() {
    }

    public Pauta(String descricaoPauta){
        this.descricaoPauta = descricaoPauta;
    }

    public long getPauta_id() {
        return pauta_id;
    }

    public void setPauta_id(long pauta_id) {
        this.pauta_id = pauta_id;
    }

    public String getDescricaoPauta() {
        return descricaoPauta;
    }

    public void setDescricaoPauta(String descricaoPauta) {
        this.descricaoPauta = descricaoPauta;
    }
}
