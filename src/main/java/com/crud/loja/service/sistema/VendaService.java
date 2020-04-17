package com.crud.loja.service.sistema;

import com.crud.loja.domain.sistema.Venda;
import com.crud.loja.domain.dto.sistema.VendaDto;
import com.crud.loja.repository.sistema.VendaRepository;
import com.crud.loja.service.comum.ServiceBaseImpl;
import org.springframework.stereotype.Service;


@Service
public class VendaService extends ServiceBaseImpl<Venda, VendaRepository, VendaDto> {

    @Override
    public Venda insert (VendaDto dto) {
        Venda venda = converterDTOParaEntidade(dto);
        vinculaItens(venda);
        repositorio.save(venda);
        return venda;
    }

    @Override
    public Venda update (VendaDto dto) {
        Venda venda = converterDTOParaEntidade(dto);
        vinculaItens(venda);
        repositorio.save(venda);
        return venda;
    }

    private void vinculaItens(Venda venda) {
        venda.getItens().forEach(x -> x.setVenda(venda));
    }
}
