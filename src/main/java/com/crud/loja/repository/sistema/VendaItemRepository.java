package com.crud.loja.repository.sistema;

import com.crud.loja.domain.sistema.Cliente;
import com.crud.loja.domain.sistema.VendaItem;
import com.crud.loja.repository.comum.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaItemRepository extends BaseRepository<VendaItem> {

}
