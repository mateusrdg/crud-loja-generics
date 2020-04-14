package com.crud.loja.service.sistema;

import com.crud.loja.domain.sistema.Venda;
import com.crud.loja.repository.sistema.VendaRepository;
import com.crud.loja.service.comum.ServiceBaseImpl;
import org.springframework.stereotype.Service;


@Service
public class VendaService extends ServiceBaseImpl<Venda, VendaRepository> {

    /*@Autowired
    private VendaRepository repository;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private  VendedorService vendedorService;
    @Autowired
    private VendaItemService vendaItemService;

    public VendaDto find(Long id){
        Optional<Venda> consulta = repository.findById(id);
        Venda venda = consulta.orElseThrow( ()-> new RuntimeException("Venda não encontrado"));
        return new VendaDto(venda);
    }

    public Venda insert (VendaDto objDto) {
        objDto.setId(null);
        Venda venda = fromDto(objDto);
        vinculaItens(venda);
        repository.save(venda);
        return venda;
    }

    public Venda update(Long id, VendaDto objDto){
        objDto.setId(id);
        Venda venda = fromDto(objDto);
        vinculaItens(venda);
        repository.save(venda);
        return venda;
    }

    private Venda fromDto(VendaDto objDto) {
        return new Venda(objDto.getId(), clienteService.fromDto(objDto.getCliente()), vendedorService.fromDto(objDto.getVendedor()),
                vendaItemService.fromDto(objDto.getItens()));
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public List<VendaDto> findAll() {
        return repository.findAll().stream().map(VendaDto::new).collect(Collectors.toList());
    }

    private void vinculaItens(Venda venda) {
        venda.getItens().forEach(x -> x.setVenda(venda));
    }*/

    @Override
    public Venda insert (Venda venda) {
        vinculaItens(venda);
        repositorio.save(venda);
        return venda;
    }

    private void vinculaItens(Venda venda) {
        venda.getItens().forEach(x -> x.setVenda(venda));
    }
}
