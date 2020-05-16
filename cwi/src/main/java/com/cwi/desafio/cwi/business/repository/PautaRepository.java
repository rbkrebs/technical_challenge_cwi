package com.cwi.desafio.cwi.business.repository;


import com.cwi.desafio.cwi.business.model.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface PautaRepository extends JpaRepository<Pauta, Long> {

}
