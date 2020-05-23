package com.cwi.desafio.cwi.business.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Voto {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "sessao_id")
    private Sessao sessao;

    @NotNull
    @OneToOne
    @JoinColumn(name = "associado_id")
    private Associado associado;

    @Enumerated
    @NotNull
    private TipoVoto tipoVoto;

}
