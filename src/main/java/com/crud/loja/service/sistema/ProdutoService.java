package com.crud.loja.service.sistema;

import com.crud.loja.domain.sistema.Produto;
import com.crud.loja.domain.dto.sistema.ProdutoDto;
import com.crud.loja.repository.sistema.ProdutoRepository;
import com.crud.loja.service.comum.ServiceBaseImpl;
import org.springframework.stereotype.Service;


@Service
public class ProdutoService extends ServiceBaseImpl<Produto, ProdutoRepository, ProdutoDto> {

}
