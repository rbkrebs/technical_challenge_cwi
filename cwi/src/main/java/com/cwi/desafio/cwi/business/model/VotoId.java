package com.cwi.desafio.cwi.business.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class VotoId  implements Serializable {


    @NotNull
    @ManyToOne
    private Sessao sessao;

    @NotNull
    @OneToOne
    private Associado associado;


}
