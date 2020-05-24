package com.cwi.desafio.cwi.business.controller;


import com.cwi.desafio.cwi.business.dto.SessaoDTO;
import com.cwi.desafio.cwi.business.exceptions.SessaoExceptionMessage;
import com.cwi.desafio.cwi.business.mappers.SessaoConverter;
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

        if(this.validaFimVotacao(sessao)){
            throw new IllegalArgumentException(SessaoExceptionMessage.TIME_ERROR);
        }

        return this.sessaoService.salvar(sessao);
    }

    @Override
    public Optional<List<Sessao>> listarTodos() {
        return this.sessaoService.listarTodos();
    }



    public boolean validaFimVotacao(Sessao sessao){

        if(sessao.getFimVotacao().isAfter(sessao.getInicioVotacao())){
            return false;
        }

        return true;
    }


}
