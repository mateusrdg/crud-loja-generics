package com.crud.loja.service.sistema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaItemService {

    @Autowired
    private ProdutoService produtoService;

    /*private VendaItem fromDto(VendaItemDto itemDto){
            return new VendaItem(itemDto.getId(), produtoService.fromDto(itemDto.getProduto()), itemDto.getQuantidade());
    }*/

    /*public List<VendaItem> fromDto(List<VendaItemDto> list) {
        return list.stream().map(this::fromDto).collect(Collectors.toList());
    }*/
}
