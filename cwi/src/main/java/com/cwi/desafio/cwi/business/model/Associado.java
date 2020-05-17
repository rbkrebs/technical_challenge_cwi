package com.cwi.desafio.cwi.business.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="TB_ASSOCIADO")
public class Associado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long associado_id;

    @NotNull
    private long cpf;

    public Associado() {
    }

    public Associado(long cpf) {
    this.cpf = cpf;
    }


    public long getAssociado_id() {
        return associado_id;
    }

    public void setAssociado_id(long associado_id) {
        this.associado_id = associado_id;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
