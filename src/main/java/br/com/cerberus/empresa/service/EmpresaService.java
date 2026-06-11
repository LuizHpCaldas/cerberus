package br.com.cerberus.empresa.service;

import br.com.cerberus.empresa.dto.EmpresaRequest;
import br.com.cerberus.empresa.entity.Empresa;
import br.com.cerberus.empresa.repository.EmpresaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmpresaService {

    private final EmpresaRepository repository;

    public Empresa criar(EmpresaRequest request) {

        Empresa empresa = Empresa.builder()
                .id(UUID.randomUUID())
                .razaoSocial(request.razaoSocial())
                .nomeFantasia(request.nomeFantasia())
                .cnpj(request.cnpj())
                .inscricaoEstadual(request.inscricaoEstadual())
                .telefone(request.telefone())
                .email(request.email())
                .ativo(true)
                .createdAt(LocalDateTime.now())
                .build();

        return repository.save(empresa);
    }
}