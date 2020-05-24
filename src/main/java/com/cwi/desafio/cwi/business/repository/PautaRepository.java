package com.cwi.desafio.cwi.business.repository;


import com.cwi.desafio.cwi.business.model.Pauta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PautaRepository extends CrudRepository<Pauta, Long> {

}
