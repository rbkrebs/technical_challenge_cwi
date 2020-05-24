package com.cwi.desafio.cwi.business.mappers;

import com.cwi.desafio.cwi.business.dto.SessaoDTO;
import com.cwi.desafio.cwi.business.mappers.interfaces.SessaoMapper;
import com.cwi.desafio.cwi.business.model.Pauta;
import com.cwi.desafio.cwi.business.model.Sessao;
import java.util.List;
import java.util.stream.Collectors;



public class SessaoConverter implements SessaoMapper {

    @Override
    public SessaoDTO modelToDto(Sessao sessao) {

        SessaoDTO sessaoDTO = new SessaoDTO();
        sessaoDTO.setFimVotacao(String.valueOf(sessao.getFimVotacao()));
        sessaoDTO.setInicioVotacao(String.valueOf(sessao.getInicioVotacao()));
        sessaoDTO.setPauta_id(sessao.getPauta().getId());

        return sessaoDTO;
    }

    @Override
    public List<SessaoDTO> map(List<Sessao> listaSessao) {

        List<SessaoDTO> listaSessaoDTO = listaSessao.stream().map(sessao -> modelToDto(sessao)).collect(Collectors.toList());


        return listaSessaoDTO;
    }

    @Override
    public Sessao dtoToModel(SessaoDTO sessaoDTO, Pauta pauta) {


        Sessao sessao = new Sessao();
        sessao.setFimVotacao(sessaoDTO.getFimVotacaoConverted());
        sessao.setInicioVotacao(sessaoDTO.getInicioVotacaoConverted());
        sessao.setPauta(pauta);


        return sessao;
    }
}
