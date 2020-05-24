package com.cwi.desafio.cwi.business.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VotoDTO {


    private long sessaoId;
    private long associadoId;
    private String voto;

}
