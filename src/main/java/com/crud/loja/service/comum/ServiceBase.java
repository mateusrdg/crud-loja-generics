package com.crud.loja.service.comum;

import java.util.List;

public interface ServiceBase<E, D> {

    D findById(Long id);

    List<D> findAll();

    E insert(D entidade);

    E update(D entidade);

    void delete(Long id);

    void verificaSeRegistroExiste(Long id);

}
