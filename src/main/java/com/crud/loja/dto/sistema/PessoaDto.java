package com.crud.loja.dto.sistema;

import com.crud.loja.domain.sistema.Pessoa;
import com.crud.loja.dto.comum.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDto extends BaseDto {

    @NotNull
    private String nome;

    public PessoaDto(Pessoa pessoa) {
        super(pessoa.getId());
        this.nome = pessoa.getNome();
    }
}
