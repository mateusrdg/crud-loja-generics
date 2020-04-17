package com.crud.loja.controller.comum;

import com.crud.loja.domain.comum.EntidadeBase;
import com.crud.loja.domain.dto.comum.BaseDto;
import com.crud.loja.repository.comum.BaseRepository;
import com.crud.loja.service.comum.ServiceBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public abstract class BaseController<E extends EntidadeBase, R extends BaseRepository<E>,
        S extends ServiceBaseImpl<E, R, D>, D extends BaseDto> {

    @Autowired
    protected S service;
    private E entidade;
    private D dto;

    @GetMapping(value = "/{id}")
    public ResponseEntity find(@PathVariable Long id) {
        dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }

    @PostMapping()
    public ResponseEntity<Void> insert(@Valid @RequestBody D dto) {
        service.insert(dto);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @Valid @RequestBody D dto) {
        service.update(dto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List> findAll() {
        List<D> dtos = service.findAll();
        return ResponseEntity.ok(dtos);
    }
}
