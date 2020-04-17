package com.crud.loja.controller.sistema;

import com.crud.loja.controller.comum.BaseController;
import com.crud.loja.domain.sistema.Venda;
import com.crud.loja.domain.dto.sistema.VendaDto;
import com.crud.loja.repository.sistema.VendaRepository;
import com.crud.loja.service.sistema.VendaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/vendas")
public class VendaController extends BaseController<Venda, VendaRepository, VendaService, VendaDto> {

}
