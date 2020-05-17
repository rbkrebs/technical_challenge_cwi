package com.cwi.desafio.cwi.business.controller;

import com.cwi.desafio.cwi.business.model.Pauta;
import com.cwi.desafio.cwi.business.repository.PautaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
public class PautaController {

    @Autowired
    private PautaRepository pautaRepository;

    public Pauta salvarPauta(Pauta pauta){
        return pautaRepository.save(pauta);
    }

    public List<Pauta> listarPautas(){
        return pautaRepository.findAll();
    }

}
