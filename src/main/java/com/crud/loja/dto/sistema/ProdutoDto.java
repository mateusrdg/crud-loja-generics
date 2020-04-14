package com.crud.loja.dto.sistema;

import com.crud.loja.domain.sistema.Produto;
import com.crud.loja.dto.base.DtoBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDto extends DtoBase {

    @NotNull
    private String descricao;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false, message = "{valor.decimalmin.not.valid}")
    private BigDecimal valor;

    public ProdutoDto(Produto produto) {
        super(produto.getId());
        this.descricao = produto.getDescricao();
        this.valor = produto.getValor();
    }
}
