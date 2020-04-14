package com.crud.loja.service.util;

import com.crud.loja.domain.base.EntidadeBase;
import com.crud.loja.domain.sistema.*;
import com.crud.loja.dto.base.DtoBase;
import com.crud.loja.repository.base.RepositorioBase;
import com.crud.loja.service.base.ServiceBaseImpl;
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
public class DBService <E extends EntidadeBase, R extends RepositorioBase<E>, S extends ServiceBaseImpl<E, R>, D extends DtoBase>{
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
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(null,"Mateus"));
        clientes.add(new Cliente(null,"Lucas"));
        clientes.add(new Cliente(null,"Gabriel"));

        log.info("Inserindo clientes...");
        clientes.forEach(clienteService::inserir);

        log.info("Instanciando vendedores...");
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(new Vendedor(null,"Lavigne"));
        vendedores.add(new Vendedor(null,"Gabrielly"));

        log.info("Inserindo vendedores...");
        vendedores.forEach(vendedorService::inserir);

        log.info("Instanciando produtos...");
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(null,"Bicicleta", new BigDecimal(325.00)));
        produtos.add(new Produto(null,"Computador", new BigDecimal(7000.00)));
        produtos.add(new Produto(null,"Sofa", new BigDecimal(1500.00)));
        produtos.add(new Produto(null,"Camisa", new BigDecimal(100.00)));
        produtos.add(new Produto(null,"Borracha", new BigDecimal(1.50)));
        produtos.add(new Produto(null,"Fogão", new BigDecimal(400.00)));
        produtos.add(new Produto(null,"Televisão", new BigDecimal(2000.00)));

        log.info("Inserindo produtos...");
        produtos.forEach(produtoService::inserir);

        log.info("Instanciando vendas");
        ArrayList<Venda> vendas = new ArrayList<>();
        List<VendaItem> itens1 = new ArrayList<>();
        itens1.add(new VendaItem(null, produtoService.buscarPorId((long)2), new BigDecimal(1.0)));
        vendas.add(new Venda(null, clienteService.buscarPorId((long) 1), vendedorService.buscarPorId((long)1), itens1));

        List<VendaItem> itens2 = new ArrayList<>();
        itens2.add(new VendaItem(null, produtoService.buscarPorId((long)4), new BigDecimal(5.0)));
        itens2.add(new VendaItem(null, produtoService.buscarPorId((long)5), new BigDecimal(10.0)));
        itens2.add(new VendaItem(null, produtoService.buscarPorId((long)6), new BigDecimal(1.0)));
        itens2.add(new VendaItem(null, produtoService.buscarPorId((long)7), new BigDecimal(2.0)));
        vendas.add(new Venda(null, clienteService.buscarPorId((long) 2), vendedorService.buscarPorId((long)2), itens2));

        List<VendaItem> itens3 = new ArrayList<>();
        itens3.add(new VendaItem(null, produtoService.buscarPorId((long)1), new BigDecimal(2.0)));
        itens3.add(new VendaItem(null, produtoService.buscarPorId((long)3), new BigDecimal(1.0)));
        vendas.add(new Venda(null, clienteService.buscarPorId((long) 3), vendedorService.buscarPorId((long)2), itens3));

        log.info("Inserindo vendas");
        vendas.forEach(vendaService::inserir);

    }
}