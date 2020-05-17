package com.cwi.desafio.cwi.rest.v1;


import com.cwi.desafio.cwi.business.controller.PautaController;
import com.cwi.desafio.cwi.business.model.Pauta;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assembleia")
@Api(value="API REST Pauta")
@CrossOrigin(origins = "*")
public class PautaRest {

    private PautaController pautaController = new PautaController();


    @GetMapping("/pauta")
    @ApiOperation(value = "Retorna todos os registros de pauta")
    public List<Pauta> findAll(){

        return this.pautaController.listarPautas();
    }

    @PostMapping("/pauta")
    @ApiOperation(value = "Cria um registro de pauta")
    public Pauta create(@Validated @RequestBody Pauta pauta) {

        return this.pautaController.salvarPauta(pauta);

    }


}
