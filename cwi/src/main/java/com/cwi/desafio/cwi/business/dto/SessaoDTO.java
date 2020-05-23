package com.cwi.desafio.cwi.business.dto;


import com.cwi.desafio.cwi.business.model.Pauta;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SessaoDTO {

    private long pauta_id;
    private String inicioVotacao;
    private String fimVotacao;

}
