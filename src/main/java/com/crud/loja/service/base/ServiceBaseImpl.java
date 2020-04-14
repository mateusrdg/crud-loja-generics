package com.crud.loja.service.base;

import com.crud.loja.domain.base.EntidadeBase;
import com.crud.loja.repository.base.RepositorioBase;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class ServiceBaseImpl<E extends EntidadeBase, R extends RepositorioBase<E>> {

    @Autowired
    protected R repositorio;

    @Autowired
    private Mapper mapper;

    public E buscarPorId(Long id) {
        verificaSeRegistroExiste(id);
        //return mapper.map(repositorio.findById(id), D.class);
        return  repositorio.findById(id).get();
    }

    public List<E> buscarTodos() {
        return (List<E>) repositorio.findAll();
    }

    public E inserir(E entidade) {
        return repositorio.save(entidade);
    }

    public E atualizar(E entidadeAlterada) {
        return repositorio.save(entidadeAlterada);
    }

    public void deletar(Long id) {
        repositorio.deleteById(id);
    }

    private void verificaSeRegistroExiste(Long id) {
        if (!repositorio.findById(id).isPresent()) {
            throw new RuntimeException("registro nao encontrado");
        }
    }
}
