package com.cwi.desafio.cwi.business.controller;


import java.util.List;
import java.util.Optional;

public interface ControllerInterface<T> {

    Optional<T> salvar(T t);

    Optional<List<T>> listarTodos();


}
