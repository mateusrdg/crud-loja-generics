package com.crud.loja.domain.sistema;

import com.crud.loja.domain.comum.EntidadeBase;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "VendaItem")
@Table(name = "venda_item")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Data
public class VendaItem extends EntidadeBase {

    @ManyToOne
    @JoinColumn(name = "venda_id")
    @JsonBackReference
    private Venda venda;

    @ManyToOne
    @JoinColumn
    private Produto produto;

    private BigDecimal quantidade;

    @Transient
    private BigDecimal valorTotal;

    public VendaItem (Long id, Produto produto, BigDecimal quantidade) {
        super(id);
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public BigDecimal getValorTotal(){
        return produto.getValor().multiply(quantidade);
    }
}
