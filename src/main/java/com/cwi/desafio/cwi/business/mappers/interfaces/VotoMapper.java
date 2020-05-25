package com.cwi.desafio.cwi.business.mappers.interfaces;



import com.cwi.desafio.cwi.business.dto.VotoDTO;
import com.cwi.desafio.cwi.business.model.Associado;
import com.cwi.desafio.cwi.business.model.Sessao;
import com.cwi.desafio.cwi.business.model.Voto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring")
public interface VotoMapper {

    @Mappings({
            @Mapping(source = "id.sessao.id", target = "sessaoId"),
            @Mapping(source = "id.associado.id", target = "associadoId"),
            @Mapping(source = "tipoVoto", target = "voto")
    })

    VotoDTO modelToDto(Voto voto);
    Voto dtoToModel(VotoDTO votoDTO, Associado associado, Sessao sessao);

}
