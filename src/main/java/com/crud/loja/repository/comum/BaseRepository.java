package com.crud.loja.repository.comum;

import com.crud.loja.domain.comum.EntidadeBase;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BaseRepository<E extends EntidadeBase> extends JpaRepository<E, Long> {

}
