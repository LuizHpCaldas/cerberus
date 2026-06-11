package br.com.cerberus.empresa.controller;

import br.com.cerberus.empresa.dto.EmpresaRequest;
import br.com.cerberus.empresa.entity.Empresa;
import br.com.cerberus.empresa.service.EmpresaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/empresas")
@RequiredArgsConstructor
public class EmpresaController {

    private final EmpresaService service;

    @PostMapping
    public Empresa criar(@RequestBody EmpresaRequest request) {
        return service.criar(request);
    }

    @GetMapping
    public List<Empresa> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Empresa buscarPorId(@PathVariable UUID id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Empresa atualizar(
            @PathVariable UUID id,
            @RequestBody EmpresaRequest request) {

        return service.atualizar(id, request);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable UUID id) {
        service.remover(id);
    }
}