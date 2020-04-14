package com.crud.loja.domain.sistema;

import com.crud.loja.domain.comum.EntidadeBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Produto")
@Table(name = "produto")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Produto extends EntidadeBase {

    private String descricao;

    private BigDecimal valor;

    @OneToMany(mappedBy = "produto")
    List<VendaItem> items = new ArrayList<>();

    public Produto(Long id, String descricao, BigDecimal valor) {
        setId(id);
        this.descricao = descricao;
        this.valor = valor;
    }

}
