package com.cwi.desafio.cwi.business.service;


import com.cwi.desafio.cwi.business.model.Pauta;
import com.cwi.desafio.cwi.business.repository.PautaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PautaService {

    @Autowired
    private PautaRepository pautaRepository;

    public Pauta salvarPauta(Pauta pauta){
        return pautaRepository.save(pauta);
    }

    public List<Pauta> listarPautas(){

        return (List<Pauta>) pautaRepository.findAll();
    }
}
