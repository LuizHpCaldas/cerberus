package br.com.cerberus.empresa.controller;

import br.com.cerberus.empresa.dto.EmpresaRequest;
import br.com.cerberus.empresa.entity.Empresa;
import br.com.cerberus.empresa.service.EmpresaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}