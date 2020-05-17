package com.cwi.desafio.cwi.business.service;


import com.cwi.desafio.cwi.business.model.Pauta;
import com.cwi.desafio.cwi.business.repository.PautaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PautaService implements ServiceInterface<Pauta> {

    @Autowired
    private PautaRepository pautaRepository;

    @Override
    public Optional<Pauta> salvar(Pauta pauta) {

        return Optional.of(pautaRepository.save(pauta));
    }

    @Override
    public Optional<List<Pauta>> listarTodos() {
        return Optional.of((List<Pauta>) pautaRepository.findAll());
    }
}
