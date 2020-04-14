package com.crud.loja.service.sistema;

import com.crud.loja.domain.sistema.Cliente;
import com.crud.loja.repository.sistema.ClienteRepository;
import com.crud.loja.service.base.ServiceBaseImpl;
import org.springframework.stereotype.Service;


@Service
public class ClienteService extends ServiceBaseImpl<Cliente, ClienteRepository> {

//    @Autowired
//    ClienteRepository repository;
//
//    public PessoaDto find(Long id){
//        Optional<Cliente> optionalCliente = repository.findById(id);
//        Cliente cliente = optionalCliente.orElseThrow( ()-> new RuntimeException("Cliente não encontrado"));
//        return new PessoaDto(cliente);
//    }
//
//    public Cliente insert (PessoaDto objDto) {
//        objDto.setId(null);
//        Cliente cliente = fromDto(objDto);
//        repository.save(cliente);
//        return cliente;
//    }
//
//    public Cliente update(Long id, PessoaDto objDto){
//        objDto.setId(id);
//        Cliente cliente = fromDto(objDto);
//        repository.save(cliente);
//        return cliente;
//    }
//
//    public Cliente fromDto(PessoaDto objDto) {
//        return new Cliente(objDto.getId(), objDto.getNome());
//    }
//
//    public void delete(Long id){
//        repository.deleteById(id);
//    }
//
//    public List<PessoaDto> findAll() {
//        return repository.findAll().stream().map(PessoaDto::new).collect(Collectors.toList());
//    }
}
