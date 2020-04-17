package com.crud.loja.domain.dto.sistema;

import com.crud.loja.domain.dto.comum.BaseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class VendaDto extends BaseDto {

    @NotNull
    private PessoaDto cliente;

    @NotNull
    private PessoaDto vendedor;

    @NotEmpty
    @NotNull
    @Valid
    List<VendaItemDto> itens = new ArrayList<>();

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private BigDecimal valorTotal;

    public VendaDto(Long id, PessoaDto cliente, PessoaDto vendedor, List<VendaItemDto> itens) {
        super(id);
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = itens;
    }
}
