package com.crud.loja.repository.base;

import com.crud.loja.domain.base.EntidadeBase;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RepositorioBase<E extends EntidadeBase> extends JpaRepository<E, Long> {

}
