package com.crud.loja.domain.dto.sistema;

import com.crud.loja.domain.dto.comum.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class PessoaDto extends BaseDto {

    @NotNull
    private String nome;

}
