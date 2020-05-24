package com.cwi.desafio.cwi.business.service;


import com.cwi.desafio.cwi.business.model.Pauta;
import com.cwi.desafio.cwi.business.model.Sessao;
import com.cwi.desafio.cwi.business.repository.PautaRepository;
import com.cwi.desafio.cwi.business.repository.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessaoService implements ServiceInterface<Sessao> {

    @Autowired
    private SessaoRepository sessaoRepository;

    @Override
    public Optional<Sessao> salvar(Sessao sessao) {

        return Optional.of(sessaoRepository.save(sessao));
    }

    @Override
    public Optional<List<Sessao>> listarTodos() {
        return Optional.of((List<Sessao>) sessaoRepository.findAll());
    }


}
