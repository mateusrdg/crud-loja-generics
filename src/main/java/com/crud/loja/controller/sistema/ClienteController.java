package com.crud.loja.controller.sistema;

import com.crud.loja.controller.comum.ControllerBase;
import com.crud.loja.domain.sistema.Cliente;
import com.crud.loja.dto.sistema.PessoaDto;
import com.crud.loja.repository.sistema.ClienteRepository;
import com.crud.loja.service.sistema.ClienteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController extends ControllerBase<Cliente, ClienteRepository, ClienteService, PessoaDto> {
/*
    @Autowired
    ClienteService service;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<PessoaDto> find(@PathVariable Long id) {
        PessoaDto cliente = service.find(id);
        return ResponseEntity.ok(cliente);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody PessoaDto cliente) {
        service.insert(cliente);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public ResponseEntity<Void> update (@PathVariable Long id, @Valid @RequestBody PessoaDto cliente){
        service.update(id, cliente);
        return  ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete (@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<PessoaDto>> findAll(){
        List<PessoaDto> clientes = service.findAll();
        return ResponseEntity.ok(clientes);
    }*/
}
