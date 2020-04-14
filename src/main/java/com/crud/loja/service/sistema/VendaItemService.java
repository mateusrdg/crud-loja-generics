package com.crud.loja.service.sistema;

import com.crud.loja.domain.sistema.VendaItem;
import com.crud.loja.repository.comum.BaseRepository;
import com.crud.loja.repository.sistema.VendaItemRepository;
import com.crud.loja.service.comum.ServiceBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaItemService extends ServiceBaseImpl<VendaItem, VendaItemRepository> {

    @Autowired
    private ProdutoService produtoService;

    /*private VendaItem fromDto(VendaItemDto itemDto){
            return new VendaItem(itemDto.getId(), produtoService.fromDto(itemDto.getProduto()), itemDto.getQuantidade());
    }*/

    /*public List<VendaItem> fromDto(List<VendaItemDto> list) {
        return list.stream().map(this::fromDto).collect(Collectors.toList());
    }*/
}
