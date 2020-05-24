package com.cwi.desafio.cwi.rest;

import com.cwi.desafio.cwi.business.controller.AssociadoController;
import com.cwi.desafio.cwi.business.model.Associado;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/associado")
@Api(value="API REST Associado")
@CrossOrigin(origins = "*")
public class AssociadoRest {

    @Autowired
    private AssociadoController associadoController;


    @GetMapping("{cpf}")
    @ApiOperation(value = "Retorna o registro do associado através do cpf")
    public List<Associado> findAll() {

        return this.associadoController.listarTodos().get();
    }
}


