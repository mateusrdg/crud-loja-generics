package com.crud.loja.controller.sistema;

import com.crud.loja.controller.comum.BaseController;
import com.crud.loja.domain.sistema.Venda;
import com.crud.loja.dto.sistema.VendaDto;
import com.crud.loja.repository.sistema.VendaRepository;
import com.crud.loja.service.sistema.VendaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/vendas")
public class VendaController extends BaseController<Venda, VendaRepository, VendaService, VendaDto> {

   /* @Autowired
    VendaService service;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<VendaDto> find(@PathVariable Long id) {
        VendaDto venda = service.find(id);
        return ResponseEntity.ok(venda);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody VendaDto venda) {
        service.insert(venda);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public ResponseEntity<Void> update (@PathVariable Long id,@Valid @RequestBody VendaDto venda){
        service.update(id, venda);
        return  ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete (@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<VendaDto>> findAll(){
        List<VendaDto> vendas = service.findAll();
        return ResponseEntity.ok(vendas);
    }*/
}
