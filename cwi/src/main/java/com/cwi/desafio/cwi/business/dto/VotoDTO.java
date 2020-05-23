package com.cwi.desafio.cwi.business.dto;


import com.cwi.desafio.cwi.business.model.Associado;
import com.cwi.desafio.cwi.business.model.Sessao;
import com.cwi.desafio.cwi.business.model.TipoVoto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VotoDTO {


    private long sessao_id;
    private long associado_id;
    private String voto;

}
