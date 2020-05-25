package com.cwi.desafio.cwi.rest.v1;



import com.cwi.desafio.cwi.business.controller.AssociadoController;
import com.cwi.desafio.cwi.business.controller.SessaoController;
import com.cwi.desafio.cwi.business.controller.VotoController;
import com.cwi.desafio.cwi.business.dto.VotoDTO;
import com.cwi.desafio.cwi.business.mappers.VotoConverter;
import com.cwi.desafio.cwi.business.model.Associado;
import com.cwi.desafio.cwi.business.model.Sessao;
import com.cwi.desafio.cwi.business.model.Voto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/assembleia")
@Api(value="API REST Voto")
@CrossOrigin(origins = "*")
public class VotoRest {

    @Autowired
    private VotoController votoController;

    @Autowired
    private AssociadoController associadoController;

    @Autowired
    private SessaoController sessaoController;

    private VotoConverter votoConverter = new VotoConverter();


    @GetMapping("/voto")
    @ApiOperation(value = "Retorna todos os registros de voto")
    public List<VotoDTO> findAll(){

        return null;
    }

    @PostMapping("/voto")
    @ApiOperation(value = "Cria um registro de voto")
    public VotoDTO create(@Validated @RequestBody VotoDTO votoDTO) {

        Associado associado = this.associadoController.buscarPorCPF(votoDTO.getAssociadoCPF()).get();
        System.out.println(associado);
        Sessao sessao = this.sessaoController.buscarPorId(votoDTO.getSessaoId()).get();

        System.out.println(sessao);
        Voto voto = this.votoConverter.dtoToModel(votoDTO, associado, sessao);

        voto = this.votoController.salvar(voto).get();

        return this.votoConverter.modelToDto(voto);
    }


}
