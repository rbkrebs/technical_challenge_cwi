package com.cwi.desafio.cwi.business.repository;


import com.cwi.desafio.cwi.business.model.Associado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AssociadoRepository extends CrudRepository<Associado, Long> {

    Associado findAssociadoByCpf(long cpf);

}
