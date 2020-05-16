package com.cwi.desafio.cwi.business.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="TB_SESSAO")
public class Sessao implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sessao_id;

    @OneToOne
    @JoinColumn(name = "pauta_id")
    private Pauta pauta;

    private LocalDateTime inicioVotacao;

    private LocalDateTime fimVotacao;

    public Sessao() {
    }

    public Sessao(Pauta pauta, LocalDateTime inicioVotacao, LocalDateTime fimVotacao) {

        this.pauta = pauta;
        this.inicioVotacao = inicioVotacao;
        this.fimVotacao = fimVotacao;
    }


    public long getSessao_id() {
        return sessao_id;
    }

    public void setSessao_id(long sessao_id) {
        this.sessao_id = sessao_id;
    }

    public Pauta getPauta() {
        return pauta;
    }

    public void setPauta(Pauta pauta) {
        this.pauta = pauta;
    }

    public LocalDateTime getInicioVotacao() {
        return inicioVotacao;
    }

    public void setInicioVotacao(LocalDateTime inicioVotacao) {
        this.inicioVotacao = inicioVotacao;
    }

    public LocalDateTime getFimVotacao() {
        return fimVotacao;
    }

    public void setFimVotacao(LocalDateTime fimVotacao) {
        this.fimVotacao = fimVotacao;
    }
}
