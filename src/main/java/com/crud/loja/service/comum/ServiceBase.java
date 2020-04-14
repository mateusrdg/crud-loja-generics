package com.crud.loja.service.comum;

import java.util.List;

public interface ServiceBase<Entidade> {

    Entidade findById(Long id);

    List<Entidade> findAll();

    Entidade insert(Entidade entidade);

    Entidade update(Entidade entidade);

    void delete(Long id);

    void verificaSeRegistroExiste(Long id);
}
