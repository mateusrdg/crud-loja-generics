package com.crud.loja.domain.sistema;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "VendaItem")
@Table(name = "venda_item")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class VendaItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public BigDecimal getValorTotal(){
        return produto.getValor().multiply(quantidade);
    }
}
