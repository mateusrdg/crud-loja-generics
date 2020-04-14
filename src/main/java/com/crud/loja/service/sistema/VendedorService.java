package com.crud.loja.service.sistema;

import com.crud.loja.domain.sistema.Vendedor;
import com.crud.loja.repository.sistema.VendedorRepository;
import com.crud.loja.service.comum.ServiceBaseImpl;
import org.springframework.stereotype.Service;


@Service
public class VendedorService extends ServiceBaseImpl<Vendedor, VendedorRepository> {

    /*@Autowired
    VendedorRepository repository;

    public PessoaDto find(Long id){
        Optional<Vendedor> optionalVendedor = repository.findById(id);
        Vendedor vendedor = optionalVendedor.orElseThrow( ()-> new RuntimeException("Vendedor não encontrado"));
        return new PessoaDto(vendedor);
    }

    public Vendedor insert (PessoaDto objDto) {
        objDto.setId(null);
        Vendedor vendedor = fromDto(objDto);
        repository.save(vendedor);
        return vendedor;
    }

    public void update(Long id, PessoaDto objDto){
        objDto.setId(id);
        Vendedor vendedor = fromDto(objDto);
        repository.save(vendedor);
    }

    public Vendedor fromDto(PessoaDto objDto) {
        return new Vendedor(objDto.getId(),objDto.getNome());
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public List<PessoaDto> findAll() {
        return repository.findAll().stream().map(PessoaDto::new).collect(Collectors.toList());
    }*/
}
