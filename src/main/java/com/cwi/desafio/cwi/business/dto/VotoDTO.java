package com.cwi.desafio.cwi.business.dto;


import com.cwi.desafio.cwi.business.exceptions.VotoExceptionMessage;
import com.cwi.desafio.cwi.business.model.TipoVoto;
import lombok.*;

import javax.validation.constraints.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class VotoDTO {

    @NotNull(message = "O id da sessão é obrigatório")
    private long sessaoId;
    @NotNull(message = "O cpf do associado é obrigatório")
    private long associadoCPF;
    @NotNull(message = "O voto é obrigatório")
    private String voto;

    public TipoVoto converteVoto(){
        TipoVoto voto = null;
        if(this.voto.toLowerCase().equals("sim")) {
            voto = TipoVoto.SIM;
        }else if(this.voto.toLowerCase().equals("nao")){

            voto = TipoVoto.NAO;
        }else {
            throw new IllegalArgumentException(VotoExceptionMessage.FORMATED_VOTE);
        }
        return voto;
    }

}
