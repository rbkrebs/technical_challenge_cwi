package com.cwi.desafio.cwi.business.exceptions;

public  abstract  class SessaoExceptionMessage {

        public static final String NOT_FOUND = "A sessão solicita não existe";
        public static final String SESSION_FINISHED = "A sessão solicitada já foi encerrada";
        public static final String TIME_ERROR = "O horário de fim de votação deve ser maior que o início da votação";
        public static final String FORMATED_TIME = "O formato do horário está errado. Deve ser do tipo yyyy-MM-dd HH:mm";

}
