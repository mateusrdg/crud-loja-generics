package com.crud.loja.domain.dto.sistema;

import com.crud.loja.domain.dto.comum.BaseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class VendaItemDto extends BaseDto {

    @NotNull
    private ProdutoDto produto;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false, message = "{valor.decimalmin.not.valid}")
    private BigDecimal quantidade;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private BigDecimal valorTotal;

    public VendaItemDto(Long id, ProdutoDto produto, BigDecimal quantidade) {
        super(id);
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
