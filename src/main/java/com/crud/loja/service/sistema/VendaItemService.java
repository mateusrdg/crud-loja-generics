package com.crud.loja.service.sistema;

import com.crud.loja.domain.sistema.VendaItem;
import com.crud.loja.domain.dto.sistema.VendaItemDto;
import com.crud.loja.repository.sistema.VendaItemRepository;
import com.crud.loja.service.comum.ServiceBaseImpl;
import org.springframework.stereotype.Service;

@Service
public class VendaItemService extends ServiceBaseImpl<VendaItem, VendaItemRepository, VendaItemDto> {
}
