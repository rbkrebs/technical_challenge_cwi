package com.cwi.desafio.cwi.business.model;

import javax.persistence.*;


@Entity

@Table(name="TB_VOTO")

public class Voto {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long voto_id;

    @OneToOne
    @JoinColumn(name = "sessao_id")
    private Sessao sessao;

    @OneToOne
    @JoinColumn(name = "associado_id")
    private Associado associado;

    private TipoVoto tipoVoto;

    public Voto() {
    }

    public Voto(Sessao sessao, Associado associado, TipoVoto tipoVoto) {
        this.sessao = sessao;
        this.associado = associado;
        this.tipoVoto = tipoVoto;
    }

    public long getVoto_id() {
        return voto_id;
    }

    public void setVoto_id(long voto_id) {
        this.voto_id = voto_id;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }

    public TipoVoto getTipoVoto() {
        return tipoVoto;
    }

    public void setTipoVoto(TipoVoto tipoVoto) {
        this.tipoVoto = tipoVoto;
    }
}
