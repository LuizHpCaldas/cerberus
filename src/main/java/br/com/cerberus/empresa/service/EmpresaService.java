package br.com.cerberus.empresa.service;

import br.com.cerberus.empresa.dto.EmpresaRequest;
import br.com.cerberus.empresa.entity.Empresa;
import br.com.cerberus.empresa.repository.EmpresaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmpresaService {

    private final EmpresaRepository repository;

    public Empresa criar(EmpresaRequest request) {

        Empresa empresa = new Empresa();

        empresa.setId(UUID.randomUUID());
        empresa.setRazaoSocial(request.razaoSocial());
        empresa.setNomeFantasia(request.nomeFantasia());
        empresa.setCnpj(request.cnpj());
        empresa.setInscricaoEstadual(request.inscricaoEstadual());
        empresa.setTelefone(request.telefone());
        empresa.setEmail(request.email());

        empresa.setAtivo(true);
        empresa.setCreatedAt(LocalDateTime.now());

        return repository.save(empresa);
    }

    public List<Empresa> listar() {
        return repository.findAll();
    }
}