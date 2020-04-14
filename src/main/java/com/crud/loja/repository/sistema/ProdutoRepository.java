package com.crud.loja.repository.sistema;

import com.crud.loja.domain.sistema.Produto;
import com.crud.loja.repository.comum.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends BaseRepository<Produto> {

}
