package com.cwi.desafio.cwi.business.controller;


import com.cwi.desafio.cwi.business.model.Sessao;
import com.cwi.desafio.cwi.business.repository.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class SessaoController {

    @Autowired
    private SessaoRepository sessaoRepository;

    public Sessao salvarSessao(Sessao sessao){
        return sessaoRepository.save(sessao);
    }

}
