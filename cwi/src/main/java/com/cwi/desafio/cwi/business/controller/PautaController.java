package com.cwi.desafio.cwi.business.controller;

import com.cwi.desafio.cwi.business.exceptions.PautaExceptionMessage;
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

        if(this.verificaDescricaoRep(pauta)){
            throw new IllegalArgumentException(PautaExceptionMessage.FORBIDDEN);
        }


        return this.pautaService.salvar(pauta);
    }

    @Override
    public Optional<List<Pauta>> listarTodos() {
        return this.pautaService.listarTodos();
    }


    public Optional<Pauta> buscarPorId(long id) {
        return this.pautaService.acharPorId(id);
    }

    public boolean verificaDescricaoRep(Pauta pauta){

        return this.pautaService.listarTodos().get().stream().filter(pautas -> pautas.getDescricaoPauta().equals(pauta.getDescricaoPauta())).findFirst().isPresent();
    }
}

