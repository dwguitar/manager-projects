CREATE TABLE  IF NOT EXISTS pessoa
(
    id INTEGER NOT NULL,
    nome VARCHAR (100) NOT NULL,
    datanascimento date,
    cpf VARCHAR (14),
    funcionario  boolean,
    CONSTRAINT pk_pessoa PRIMARY KEY (id)
);

CREATE TABLE  IF NOT EXISTS projeto (
     id INTEGER NOT NULL PRIMARY KEY,
     nome VARCHAR(200) NOT NULL,
     data_inicio DATE,
     data_previsao_fim DATE,
     data_fim DATE,
     descricao VARCHAR(5000),
     status VARCHAR(45),
     orcamento DECIMAL(10, 2), -- Assuming orcamento is a decimal
     risco VARCHAR(45),
     idgerente INTEGER NOT NULL,
     CONSTRAINT fk_gerente FOREIGN KEY (idgerente) REFERENCES pessoa (id)
);


CREATE TABLE  IF NOT EXISTS membro (
     id INTEGER NOT NULL PRIMARY KEY,
     idprojeto INTEGER NOT NULL,
     idpessoa INTEGER NOT NULL,
     CONSTRAINT fk_membros_projeto FOREIGN KEY (idprojeto) REFERENCES projeto (id),
     CONSTRAINT fk_membros_pessoa FOREIGN KEY (idpessoa) REFERENCES pessoa (id)
);


