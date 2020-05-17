package com.cwi.desafio.cwi.business.controller;



import com.cwi.desafio.cwi.business.model.Voto;
import com.cwi.desafio.cwi.business.repository.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class VotoController {

    @Autowired
    private VotoRepository votoRepository;

    public Voto salvarVoto(Voto voto){
        return votoRepository.save(voto);
    }

}
