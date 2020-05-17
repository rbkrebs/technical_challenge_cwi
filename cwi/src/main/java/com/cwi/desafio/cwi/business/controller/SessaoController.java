package com.cwi.desafio.cwi.business.controller;


import com.cwi.desafio.cwi.business.model.Sessao;
import com.cwi.desafio.cwi.business.service.SessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;


@Controller
public class SessaoController implements ControllerInterface<Sessao> {

    @Autowired
    private SessaoService sessaoService;


    @Override
    public Optional<Sessao> salvar(Sessao sessao) {
        return this.sessaoService.salvar(sessao);
    }

    @Override
    public Optional<List<Sessao>> listarTodos() {
        return this.sessaoService.listarTodos();
    }
}
