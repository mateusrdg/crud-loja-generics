package com.crud.loja.controller.comum;

import com.crud.loja.domain.comum.EntidadeBase;
import com.crud.loja.dto.comum.BaseDto;
import com.crud.loja.repository.comum.BaseRepository;
import com.crud.loja.service.comum.ServiceBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

public abstract class BaseController<E extends EntidadeBase, R extends BaseRepository<E>,
        S extends ServiceBaseImpl<E, R>, D extends BaseDto> {

    @Autowired
    protected S service;
    private E entidade;
    private D dto;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<E> find(@PathVariable Long id) {
        entidade = service.findById(id);
        return ResponseEntity.ok(entidade);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody D dto) {
        service.insert(entidade);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@PathVariable Long id, @Valid @RequestBody D dto) {
        service.update(entidade);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<E>> findAll() {
        List<E> entidades = service.findAll();
        return ResponseEntity.ok(entidades);
    }
}
