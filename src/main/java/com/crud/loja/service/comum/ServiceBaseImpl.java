package com.crud.loja.service.comum;

import com.crud.loja.domain.comum.EntidadeBase;
import com.crud.loja.repository.comum.BaseRepository;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class ServiceBaseImpl<Entidade extends EntidadeBase, Repositorio extends BaseRepository<Entidade>>
        implements ServiceBase <Entidade>{

    @Autowired
    protected Repositorio repositorio;

    @Autowired
    private Mapper mapper;

    public Entidade findById(Long id) {
        verificaSeRegistroExiste(id);
        //return mapper.map(repositorio.findById(id), D.class);
        return  repositorio.findById(id).get();
    }

    public List<Entidade> findAll() {
        return repositorio.findAll();
    }

    public Entidade insert(Entidade entidade) {
        return repositorio.save(entidade);
    }

    public Entidade update(Entidade entidade) {
        return repositorio.save(entidade);
    }

    public void delete(Long id) {
        repositorio.deleteById(id);
    }

    public void verificaSeRegistroExiste(Long id) {
        if (!repositorio.findById(id).isPresent()) {
            throw new RuntimeException("Registro nao encontrado");
        }
    }
}
