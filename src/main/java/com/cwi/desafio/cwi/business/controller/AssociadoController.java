package com.cwi.desafio.cwi.business.controller;

import com.cwi.desafio.cwi.business.exceptions.VotoExceptionMessage;
import com.cwi.desafio.cwi.business.model.Associado;
import com.cwi.desafio.cwi.business.model.Pauta;
import com.cwi.desafio.cwi.business.repository.AssociadoRepository;
import com.cwi.desafio.cwi.business.service.AssociadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;



@Controller
public class AssociadoController implements ControllerInterface<Associado> {

    @Autowired
    private AssociadoService associadoService;

    @Override
    public Optional<Associado> salvar(Associado associado) {
        if(this.verificaCpfRep(associado)){
            throw new IllegalArgumentException(VotoExceptionMessage.MULTIPLE_VOTE);
        }
        return this.associadoService.salvar(associado);
    }

    @Override
    public Optional<List<Associado>> listarTodos() {
        return this.associadoService.listarTodos();
    }

    public Optional<Associado> buscarPorCPF(long cpf) {
        return this.associadoService.acharPorCPF(cpf);
    }

    public boolean verificaCpfRep(Associado associado){

        return this.associadoService.listarTodos().get().stream().filter(associados -> associados.getCpf() == associado.getCpf()).findFirst().isPresent();
    }
}
