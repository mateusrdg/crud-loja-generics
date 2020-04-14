package com.crud.loja.service.sistema;

import com.crud.loja.domain.sistema.Cliente;
import com.crud.loja.repository.sistema.ClienteRepository;
import com.crud.loja.service.comum.ServiceBaseImpl;
import org.springframework.stereotype.Service;


@Service
public class ClienteService extends ServiceBaseImpl<Cliente, ClienteRepository> {

}
