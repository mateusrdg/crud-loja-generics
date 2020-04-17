package com.crud.loja.domain.sistema;

import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Cliente")
@Table(name = "cliente")
@AllArgsConstructor

public class Cliente extends Pessoa {
}
