package com.cwi.desafio.cwi.business.exceptions;

public  class PautaExceptionMessage extends Throwable {

    public static final String NOT_FOUND = "A pauta solicitada não foi encontrada";
    public static final String FORBIDDEN = "Já existe uma pauta com essa descrição";

}
