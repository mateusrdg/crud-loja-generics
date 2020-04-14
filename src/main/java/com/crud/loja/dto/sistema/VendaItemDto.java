package com.crud.loja.dto.sistema;

import com.crud.loja.domain.sistema.VendaItem;
import com.crud.loja.dto.comum.BaseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendaItemDto extends BaseDto {

    @NotNull
    private ProdutoDto produto;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false, message = "{valor.decimalmin.not.valid}")
    private BigDecimal quantidade;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private BigDecimal valorTotal;

    /*public VendaItemDto(VendaItem item) {
        super(item.getId());
        this.produto = new ProdutoDto(item.getProduto());
        this.quantidade = item.getQuantidade();
        this.valorTotal = item.getValorTotal();
    }
*/
    public VendaItemDto(Long id, ProdutoDto produto, BigDecimal quantidade) {
        super(id);
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
