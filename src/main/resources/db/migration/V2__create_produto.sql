CREATE TABLE produto (
                         id UUID PRIMARY KEY,

                         codigo BIGINT NOT NULL UNIQUE,

                         descricao VARCHAR(255) NOT NULL,

                         unidade VARCHAR(10) NOT NULL,

                         ativo BOOLEAN NOT NULL DEFAULT TRUE,

                         created_at TIMESTAMP NOT NULL,
                         updated_at TIMESTAMP
);