package com.cwi.desafio.cwi.business.service;


import com.cwi.desafio.cwi.business.model.Pauta;
import com.cwi.desafio.cwi.business.model.Voto;
import com.cwi.desafio.cwi.business.repository.PautaRepository;
import com.cwi.desafio.cwi.business.repository.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VotoService implements ServiceInterface<Voto> {

    @Autowired
    private VotoRepository votoRepository;

    @Override
    public Optional<Voto> salvar(Voto voto) {

        return Optional.of(votoRepository.save(voto));
    }

    @Override
    public Optional<List<Voto>> listarTodos() {
        return Optional.of( votoRepository.findAll());
    }
}
