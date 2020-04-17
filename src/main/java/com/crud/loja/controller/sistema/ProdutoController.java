package com.crud.loja.controller.sistema;

import com.crud.loja.controller.comum.BaseController;
import com.crud.loja.domain.sistema.Produto;
import com.crud.loja.domain.dto.sistema.ProdutoDto;
import com.crud.loja.repository.sistema.ProdutoRepository;
import com.crud.loja.service.sistema.ProdutoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController extends BaseController<Produto, ProdutoRepository, ProdutoService, ProdutoDto> {
}
