package com.cwi.desafio.cwi.business.service;


import com.cwi.desafio.cwi.business.model.Associado;
import com.cwi.desafio.cwi.business.model.Pauta;
import com.cwi.desafio.cwi.business.repository.AssociadoRepository;
import com.cwi.desafio.cwi.business.repository.PautaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class AssociadoService implements ServiceInterface<Associado> {

    @Autowired
    private AssociadoRepository associadoRepository;

    @Override
    public Optional<Associado> salvar(Associado associado) {

        return Optional.of(associadoRepository.save(associado));
    }

    @Override
    public Optional<List<Associado>> listarTodos() {
        return Optional.of((List<Associado>) associadoRepository.findAll());
    }


    public  Optional<Associado> acharPorCPF(long CPF) {

        return Optional.of(associadoRepository.findAssociadoByCpf(CPF));
    }
}
