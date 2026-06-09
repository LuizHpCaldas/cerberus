CREATE TABLE empresa (
                         id UUID PRIMARY KEY,
                         razao_social VARCHAR(255) NOT NULL,
                         nome_fantasia VARCHAR(255),
                         cnpj VARCHAR(14) NOT NULL UNIQUE,
                         inscricao_estadual VARCHAR(20),
                         telefone VARCHAR(20),
                         email VARCHAR(255),
                         ativo BOOLEAN NOT NULL DEFAULT TRUE,
                         created_at TIMESTAMP NOT NULL,
                         updated_at TIMESTAMP
);