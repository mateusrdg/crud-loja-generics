package com.crud.loja.service.sistema;

import com.crud.loja.domain.sistema.Vendedor;
import com.crud.loja.domain.dto.sistema.PessoaDto;
import com.crud.loja.repository.sistema.VendedorRepository;
import com.crud.loja.service.comum.ServiceBaseImpl;
import org.springframework.stereotype.Service;


@Service
public class VendedorService extends ServiceBaseImpl<Vendedor, VendedorRepository, PessoaDto> {

}
