package com.cwi.desafio.cwi.rest.v1;



import com.cwi.desafio.cwi.business.controller.VotoController;
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


    @GetMapping("/voto")
    @ApiOperation(value = "Retorna todos os registros de voto")
    public List<Voto> findAll(){

        return this.votoController.listarTodos().get();
    }

    @PostMapping("/voto")
    @ApiOperation(value = "Cria um registro de voto")
    public Voto create(@Validated @RequestBody Voto voto) {

        return this.votoController.salvar(voto).get();
    }


}
