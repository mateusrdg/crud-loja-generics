package com.crud.loja.service.base;

import java.util.List;

public interface ServiceBase<ENTIDADE> {

    ENTIDADE buscarPorId(Long id);

    List<ENTIDADE> buscarTodos();

    ENTIDADE inserir(ENTIDADE entidade);

    ENTIDADE atualizar(ENTIDADE entidade);

    void deletar(Long id);

}
