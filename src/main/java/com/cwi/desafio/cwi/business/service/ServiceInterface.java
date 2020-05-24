package com.cwi.desafio.cwi.business.service;


import java.util.List;
import java.util.Optional;

public interface ServiceInterface<T>{


    Optional<T> salvar(T t);

    Optional<List<T>> listarTodos();

}
