package com.crud.loja.domain.sistema;

import com.crud.loja.domain.comum.EntidadeBase;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Venda")
@Table(name = "venda")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class Venda extends EntidadeBase {

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "vendedor_id")
    private Vendedor vendedor;

    @JsonManagedReference
    @OneToMany(mappedBy = "venda", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    List<VendaItem> itens = new ArrayList<>();

    @Transient
    private BigDecimal valorTotal;

    public Venda(Long id, Cliente cliente, Vendedor vendedor, List<VendaItem> itens) {
        super(id);
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = itens;
    }

    public BigDecimal getValorTotal(){
        return itens.stream().map(VendaItem::getValorTotal).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
