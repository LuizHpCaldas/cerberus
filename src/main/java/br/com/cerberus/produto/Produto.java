package br.com.cerberus.produto.entity;

import br.com.cerberus.shared.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "produto")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Produto extends BaseEntity {

    @Id
    private UUID id;

    @Column(nullable = false, unique = true)
    private Long codigo;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String unidade;
}