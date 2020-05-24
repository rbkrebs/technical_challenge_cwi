package com.cwi.desafio.cwi.rest.v1;



import com.cwi.desafio.cwi.business.controller.PautaController;
import com.cwi.desafio.cwi.business.controller.SessaoController;
import com.cwi.desafio.cwi.business.dto.SessaoDTO;
import com.cwi.desafio.cwi.business.mappers.SessaoConverter;
import com.cwi.desafio.cwi.business.mappers.interfaces.SessaoMapper;
import com.cwi.desafio.cwi.business.model.Pauta;
import com.cwi.desafio.cwi.business.model.Sessao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/assembleia")
@Api(value="API REST Sessao")
@CrossOrigin(origins = "*")
public class SessaoRest {

    @Autowired
    private SessaoController sessaoController;

    @Autowired
    private PautaController pautaController;

    private SessaoConverter sessaoConverter = new SessaoConverter();


    @GetMapping("/sessao")
    @ApiOperation(value = "Retorna todos os registros de sessao")
    public List<SessaoDTO> findAll(){

        List<Sessao> listaSessao= this.sessaoController.listarTodos().get();

        List<SessaoDTO> sessaoDTOList= this.sessaoConverter.map(listaSessao);

        return sessaoDTOList;
    }

    @PostMapping("/sessao")
    @ApiOperation(value = "Cria um registro de sessao")
    public SessaoDTO create(@Validated @RequestBody SessaoDTO sessaoDTO) {

        Pauta pauta = this.pautaController.buscarPorId(sessaoDTO.getPauta_id()).get();

        Sessao sessao = this.sessaoConverter.dtoToModel(sessaoDTO, pauta);

        sessao = this.sessaoController.salvar(sessao).get();

        System.out.println(sessao);

        return this.sessaoConverter.modelToDto(sessao);

    }


}
