package com.cwi.desafio.cwi.business.controller;

import com.cwi.desafio.cwi.business.model.Pauta;
import com.cwi.desafio.cwi.business.service.PautaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
public class PautaController {

   @Autowired
    private PautaService pautaService;

   public Pauta salvarPauta(Pauta pauta){
       return this.pautaService.salvarPauta(pauta);
   }

   public List<Pauta> listarPautas(){
       return (List<Pauta>) this.pautaService.listarPautas();
   }

}
