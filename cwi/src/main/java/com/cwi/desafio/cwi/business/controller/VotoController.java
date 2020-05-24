package com.cwi.desafio.cwi.business.controller;



import com.cwi.desafio.cwi.business.model.Voto;
import com.cwi.desafio.cwi.business.service.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;


@Controller
public class VotoController implements ControllerInterface<Voto> {

    @Autowired
    private VotoService votoService;

    @Override
    public Optional<Voto> salvar(Voto voto) {
        return this.votoService.salvar(voto);
    }

    @Override
    public Optional<List<Voto>> listarTodos() {
        return this.votoService.listarTodos();
    }


}
