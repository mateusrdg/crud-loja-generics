package com.crud.loja.controller.comum;

import com.crud.loja.domain.base.EntidadeBase;
import com.crud.loja.dto.base.DtoBase;
import com.crud.loja.repository.base.RepositorioBase;
import com.crud.loja.service.base.ServiceBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

public abstract class ControllerBase<E extends EntidadeBase, R extends RepositorioBase<E>, S extends ServiceBaseImpl<E, R>, D extends DtoBase> {

    @Autowired
    protected S service;
    private E entidade;
    private D dto;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<E> find(@PathVariable Long id) {
        entidade = service.buscarPorId(id);
        return ResponseEntity.ok(entidade);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody D dto) {
        service.inserir(entidade);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@PathVariable Long id, @Valid @RequestBody D dto) {
        service.atualizar(entidade);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<E>> findAll() {
        List<E> entidades = service.buscarTodos();
        return ResponseEntity.ok(entidades);
    }
}
