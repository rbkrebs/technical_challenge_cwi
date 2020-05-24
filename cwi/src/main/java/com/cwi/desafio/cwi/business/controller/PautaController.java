package com.cwi.desafio.cwi.business.controller;

import com.cwi.desafio.cwi.business.model.Pauta;
import com.cwi.desafio.cwi.business.service.PautaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;


@Controller
public class PautaController implements ControllerInterface<Pauta> {

    @Autowired
    private PautaService pautaService;


    @Override
    public Optional<Pauta> salvar(Pauta pauta) {


        return this.pautaService.salvar(pauta);
    }

    @Override
    public Optional<List<Pauta>> listarTodos() {
        return this.pautaService.listarTodos();
    }


    public Optional<Pauta> buscarPorId(long id) {
        return pautaService.acharPorId(id);
    }
}

