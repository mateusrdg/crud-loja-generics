package com.crud.loja.domain.sistema;

import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Vendedor")
@Table(name = "vendedor")
@AllArgsConstructor
public class Vendedor extends Pessoa {

    public Vendedor(Long id, String nome) {
        super(id, nome);
    }

}
