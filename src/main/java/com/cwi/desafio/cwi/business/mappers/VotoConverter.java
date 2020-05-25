package com.cwi.desafio.cwi.business.mappers;


import com.cwi.desafio.cwi.business.dto.VotoDTO;
import com.cwi.desafio.cwi.business.mappers.interfaces.VotoMapper;
import com.cwi.desafio.cwi.business.model.Associado;
import com.cwi.desafio.cwi.business.model.Sessao;
import com.cwi.desafio.cwi.business.model.Voto;
import com.cwi.desafio.cwi.business.model.VotoId;

import java.util.List;



public class VotoConverter implements VotoMapper {


    @Override
    public VotoDTO modelToDto(Voto voto) {

        VotoDTO votoDTO = new VotoDTO();
        votoDTO.setAssociadoCPF(voto.getId().getAssociado().getId());
        votoDTO.setSessaoId(voto.getId().getSessao().getId());
        votoDTO.setVoto(String.valueOf(voto.getTipoVoto()));

        return votoDTO;
    }

    @Override
    public Voto dtoToModel(VotoDTO votoDTO, Associado associado, Sessao sessao) {

        Voto voto = new Voto();
        VotoId votoId = new VotoId();

        voto.setTipoVoto(votoDTO.converteVoto());

        votoId.setAssociado(associado);
        votoId.setSessao(sessao);

        voto.setId(votoId);

        System.out.println(votoId);

        return voto;
    }


}
