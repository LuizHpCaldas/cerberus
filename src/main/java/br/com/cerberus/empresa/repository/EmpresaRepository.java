package br.com.cerberus.empresa.repository;

import br.com.cerberus.empresa.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmpresaRepository extends JpaRepository<Empresa, UUID> {
}