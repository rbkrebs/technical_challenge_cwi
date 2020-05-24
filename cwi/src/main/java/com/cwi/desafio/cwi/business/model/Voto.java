package com.cwi.desafio.cwi.business.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Voto {


    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private VotoId id;


    @Enumerated
    @NotNull
    private TipoVoto tipoVoto;

}
