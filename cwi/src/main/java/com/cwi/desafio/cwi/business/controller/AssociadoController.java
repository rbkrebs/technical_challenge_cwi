package com.cwi.desafio.cwi.business.controller;

import com.cwi.desafio.cwi.business.model.Associado;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;



@Controller
public class AssociadoController implements ControllerInterface<Associado> {

    @Override
    public Optional<Associado> salvar(Associado associado) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Associado>> listarTodos() {
        return Optional.empty();
    }
}
