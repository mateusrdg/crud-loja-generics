package com.crud.loja.service.sistema;

import com.crud.loja.domain.sistema.Produto;
import com.crud.loja.repository.sistema.ProdutoRepository;
import com.crud.loja.service.base.ServiceBaseImpl;
import org.springframework.stereotype.Service;


@Service
public class ProdutoService extends ServiceBaseImpl<Produto, ProdutoRepository> {

   /* public Produto buscarPorId(Long id) {
      return null;
    }
    public ProdutoDto find(Long id){
        Optional<Produto> consulta = repository.findById(id);
        Produto produto = consulta.orElseThrow( ()-> new RuntimeException("Produto não encontrado"));
        return new ProdutoDto(produto);
    }

    public Produto insert (ProdutoDto objDto) {
        objDto.setId(null);
        Produto produto = fromDto(objDto);
        repository.save(produto);
        return produto;
    }

    public Produto update(Long id, ProdutoDto objDto){
        objDto.setId(id);
        Produto produto = fromDto(objDto);
        repository.save(produto);
        return produto;
    }

    public Produto fromDto(ProdutoDto objDto) {
        return new Produto((objDto.getId()), objDto.getDescricao(), objDto.getValor());
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public List<ProdutoDto> findAll() {
        return repository.findAll().stream().map(ProdutoDto::new).collect(Collectors.toList());
    }*/
}
