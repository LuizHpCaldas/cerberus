package br.com.cerberus.produto.service;

import br.com.cerberus.produto.dto.ProdutoRequest;
import br.com.cerberus.produto.entity.Produto;
import br.com.cerberus.produto.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository repository;

    public Produto criar(ProdutoRequest request) {

        Produto produto = new Produto();

        produto.setId(UUID.randomUUID());

        produto.setCodigo(System.currentTimeMillis());

        produto.setDescricao(request.descricao());
        produto.setUnidade(request.unidade());

        produto.setAtivo(true);
        produto.setCreatedAt(LocalDateTime.now());

        return repository.save(produto);
    }

    public List<Produto> listar() {
        return repository.findAll();
    }
}