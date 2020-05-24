package com.cwi.desafio.cwi.business.mappers.interfaces;


import com.cwi.desafio.cwi.business.dto.SessaoDTO;
import com.cwi.desafio.cwi.business.model.Pauta;
import com.cwi.desafio.cwi.business.model.Sessao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SessaoMapper {

    SessaoMapper INSTANCE = Mappers.getMapper( SessaoMapper.class );

    @Mappings({
            @Mapping(source = "pauta", target = "pautaId"),
            @Mapping(source = "inicioVotacao", target = "fimVotacao", dateFormat = "yyyy-MM-dd HH:mm"),
            @Mapping(source = "fimVotacao", target = "fimVotacao", dateFormat = "yyyy-MM-dd HH:mm")
    })

    SessaoDTO modelToDto(Sessao sessao);
    List<SessaoDTO> map (List<Sessao> listaSessao);
    Sessao dtoToModel(SessaoDTO sessaoDTO, Pauta pauta);


}
