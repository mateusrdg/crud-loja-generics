package com.crud.loja.domain.sistema;

import com.crud.loja.domain.comum.EntidadeBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)

public abstract class Pessoa extends EntidadeBase {

    private String nome;

}
