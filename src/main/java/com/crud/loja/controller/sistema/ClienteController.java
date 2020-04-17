package com.crud.loja.controller.sistema;

import com.crud.loja.controller.comum.BaseController;
import com.crud.loja.domain.sistema.Cliente;
import com.crud.loja.domain.dto.sistema.PessoaDto;
import com.crud.loja.repository.sistema.ClienteRepository;
import com.crud.loja.service.sistema.ClienteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController extends BaseController<Cliente, ClienteRepository, ClienteService, PessoaDto> {

}
