package br.com.cerberus.empresa.dto;

public record EmpresaRequest(
        String razaoSocial,
        String nomeFantasia,
        String cnpj,
        String inscricaoEstadual,
        String telefone,
        String email
) {
}