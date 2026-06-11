package br.com.cerberus.empresa.service;

import br.com.cerberus.empresa.dto.EmpresaRequest;
import br.com.cerberus.empresa.entity.Empresa;
import br.com.cerberus.empresa.repository.EmpresaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;
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
        return repository.findByAtivoTrue();
    }

    public Empresa buscarPorId(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Empresa não encontrada"));
    }

    public Empresa atualizar(UUID id, EmpresaRequest request) {

        Empresa empresa = buscarPorId(id);

        empresa.setRazaoSocial(request.razaoSocial());
        empresa.setNomeFantasia(request.nomeFantasia());
        empresa.setCnpj(request.cnpj());
        empresa.setInscricaoEstadual(request.inscricaoEstadual());
        empresa.setTelefone(request.telefone());
        empresa.setEmail(request.email());

        empresa.setUpdatedAt(LocalDateTime.now());

        return repository.save(empresa);
    }

    public void remover(UUID id) {

        Empresa empresa = buscarPorId(id);

        empresa.setAtivo(false);
        empresa.setUpdatedAt(LocalDateTime.now());

        repository.save(empresa);
    }
}