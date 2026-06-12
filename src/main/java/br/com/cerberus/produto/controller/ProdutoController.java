package br.com.cerberus.produto.controller;

import br.com.cerberus.produto.dto.ProdutoRequest;
import br.com.cerberus.produto.entity.Produto;
import br.com.cerberus.produto.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService service;

    @PostMapping
    public Produto criar(@RequestBody ProdutoRequest request) {
        return service.criar(request);
    }

    @GetMapping
    public List<Produto> listar() {
        return service.listar();
    }
}