package com.cwi.desafio.cwi.business.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="TB_ASSOCIADO")
public class Associado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long associado_id;

    private long cpf;


}
