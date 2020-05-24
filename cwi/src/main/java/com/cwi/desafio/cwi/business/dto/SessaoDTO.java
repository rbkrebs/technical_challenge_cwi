package com.cwi.desafio.cwi.business.dto;


import com.cwi.desafio.cwi.business.mappers.SessaoConverter;
import com.cwi.desafio.cwi.business.model.Pauta;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotNull;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SessaoDTO {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    @NotNull
    private long pauta_id;
    @NotNull
    private String inicioVotacao;
    private String fimVotacao;

    @JsonIgnore
    public LocalDateTime getInicioVotacaoConverted()  {
        LocalDateTime dateTime = LocalDateTime.parse(this.inicioVotacao, formatter);
        return dateTime;
    }

    @JsonIgnore
    public LocalDateTime getFimVotacaoConverted() {
        LocalDateTime dateTime = LocalDateTime.parse(this.fimVotacao, formatter);
        return dateTime;
    }



}
