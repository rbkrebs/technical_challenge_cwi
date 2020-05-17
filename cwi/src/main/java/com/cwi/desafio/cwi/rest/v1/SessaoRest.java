package com.cwi.desafio.cwi.rest.v1;



import com.cwi.desafio.cwi.business.controller.SessaoController;
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


    @GetMapping("/sessao")
    @ApiOperation(value = "Retorna todos os registros de sessao")
    public List<Sessao> findAll(){

        return this.sessaoController.listarTodos().get();
    }

    @PostMapping("/sessao")
    @ApiOperation(value = "Cria um registro de sessao")
    public Sessao create(@Validated @RequestBody Sessao sessao) {

        return this.sessaoController.salvar(sessao).get();

    }


}
