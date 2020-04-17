package com.crud.loja.controller.sistema;

import com.crud.loja.controller.comum.BaseController;
import com.crud.loja.domain.sistema.Vendedor;
import com.crud.loja.domain.dto.sistema.PessoaDto;
import com.crud.loja.repository.sistema.VendedorRepository;
import com.crud.loja.service.sistema.VendedorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/vendedores")
public class VendedorController extends BaseController<Vendedor, VendedorRepository, VendedorService, PessoaDto> {

}
