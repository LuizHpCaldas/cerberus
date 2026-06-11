package br.com.cerberus.empresa.entity;

import br.com.cerberus.shared.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "empresa")
@NoArgsConstructor
@AllArgsConstructor
public class Empresa extends BaseEntity {

    @Id
    private UUID id;

    @Column(nullable = false)
    private String razaoSocial;

    private String nomeFantasia;

    @Column(nullable = false, unique = true)
    private String cnpj;

    private String inscricaoEstadual;

    private String telefone;

    private String email;
}