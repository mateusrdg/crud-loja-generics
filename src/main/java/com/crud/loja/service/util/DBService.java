package com.crud.loja.service.util;

import com.crud.loja.domain.comum.EntidadeBase;
import com.crud.loja.domain.dto.sistema.VendaDto;
import com.crud.loja.domain.dto.sistema.VendaItemDto;
import com.crud.loja.domain.sistema.*;
import com.crud.loja.domain.dto.comum.BaseDto;
import com.crud.loja.domain.dto.sistema.PessoaDto;
import com.crud.loja.domain.dto.sistema.ProdutoDto;
import com.crud.loja.repository.comum.BaseRepository;
import com.crud.loja.service.comum.ServiceBaseImpl;
import com.crud.loja.service.sistema.ClienteService;
import com.crud.loja.service.sistema.ProdutoService;
import com.crud.loja.service.sistema.VendaService;
import com.crud.loja.service.sistema.VendedorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class DBService <E extends EntidadeBase, R extends BaseRepository<E>, S extends ServiceBaseImpl<E, R, D>, D extends BaseDto>{
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private VendedorService vendedorService;
    @Autowired
    private ProdutoService produtoService;
    @Autowired
    private VendaService vendaService;



    public void instantiateTestsData (){


        log.info("Instanciando clientes...");
        ArrayList<PessoaDto> clientes = new ArrayList<>();
        clientes.add(new PessoaDto("Mateus"));
        clientes.add(new PessoaDto("Lucas"));
        clientes.add(new PessoaDto("Gabriel"));

        log.info("Inserindo clientes...");
        clientes.forEach(clienteService::insert);

        log.info("Instanciando vendedores...");
        ArrayList<PessoaDto> vendedores = new ArrayList<>();
        vendedores.add(new PessoaDto("Lavigne"));
        vendedores.add(new PessoaDto("Gabrielly"));

        log.info("Inserindo vendedores...");
        vendedores.forEach(vendedorService::insert);

        log.info("Instanciando produtos...");
        ArrayList<ProdutoDto> produtos = new ArrayList<>();
        produtos.add(new ProdutoDto("Bicicleta", new BigDecimal(325.00)));
        produtos.add(new ProdutoDto("Computador", new BigDecimal(7000.00)));
        produtos.add(new ProdutoDto("Sofa", new BigDecimal(1500.00)));
        produtos.add(new ProdutoDto("Camisa", new BigDecimal(100.00)));
        produtos.add(new ProdutoDto("Borracha", new BigDecimal(1.50)));
        produtos.add(new ProdutoDto("Fogão", new BigDecimal(400.00)));
        produtos.add(new ProdutoDto("Televisão", new BigDecimal(2000.00)));

        log.info("Inserindo produtos...");
        produtos.forEach(produtoService::insert);

        log.info("Instanciando vendas");
        ArrayList<VendaDto> vendas = new ArrayList<>();
        List<VendaItemDto> itens1 = new ArrayList<>();
        itens1.add(new VendaItemDto(null, produtoService.findById((long)2), new BigDecimal(1.0)));
        vendas.add(new VendaDto(null, clienteService.findById((long) 1), vendedorService.findById((long)1), itens1));

        List<VendaItemDto> itens2 = new ArrayList<>();
        itens2.add(new VendaItemDto(null, produtoService.findById((long)4), new BigDecimal(5.0)));
        itens2.add(new VendaItemDto(null, produtoService.findById((long)5), new BigDecimal(10.0)));
        itens2.add(new VendaItemDto(null, produtoService.findById((long)6), new BigDecimal(1.0)));
        itens2.add(new VendaItemDto(null, produtoService.findById((long)7), new BigDecimal(2.0)));
        vendas.add(new VendaDto(null, clienteService.findById((long) 2), vendedorService.findById((long)2), itens2));

        List<VendaItemDto> itens3 = new ArrayList<>();
        itens3.add(new VendaItemDto(null, produtoService.findById((long)1), new BigDecimal(2.0)));
        itens3.add(new VendaItemDto(null, produtoService.findById((long)3), new BigDecimal(1.0)));
        vendas.add(new VendaDto(null, clienteService.findById((long) 3), vendedorService.findById((long)2), itens3));

        log.info("Inserindo vendas");
        vendas.forEach(vendaService::insert);

    }
}
