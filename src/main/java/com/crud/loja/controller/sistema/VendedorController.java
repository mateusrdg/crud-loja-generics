package com.crud.loja.controller.sistema;

import com.crud.loja.controller.comum.ControllerBase;
import com.crud.loja.domain.sistema.Vendedor;
import com.crud.loja.dto.sistema.PessoaDto;
import com.crud.loja.repository.sistema.VendedorRepository;
import com.crud.loja.service.sistema.VendedorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/vendedores")
public class VendedorController extends ControllerBase<Vendedor, VendedorRepository, VendedorService, PessoaDto> {

    /*@Autowired
    VendedorService service;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<PessoaDto> find(@PathVariable Long id) {
        PessoaDto vendedor = service.find(id);
        return ResponseEntity.ok(vendedor);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody PessoaDto vendedor) {
        service.insert(vendedor);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public ResponseEntity<Void> update (@PathVariable Long id, @Valid @RequestBody PessoaDto vendedor){
        service.update(id, vendedor);
        return  ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete (@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<PessoaDto>> findAll(){
        List<PessoaDto> vendedores = service.findAll();
        return ResponseEntity.ok(vendedores);
    }*/
}
