--Person
INSERT INTO PESSOA (ID, NOME, DATANASCIMENTO, CPF, FUNCIONARIO)
VALUES (1000, 'Davi Kevin', '2003-01-30', '69247781000', true),
       (1001, 'Joao Deep', '2003-01-30', '69247781000', true),
       (1002, 'Michael Jackson', '2003-01-30', '69247781000', true),
       (1003, 'Chico Science', '2003-01-30', '69247781000', true),
       (1004, 'David Guilmour', '2003-01-30', '69247781000', true),
       (1005, 'Dalthon Wagner', '2003-01-30', '69247781000', true),
       (1006, 'Joe Satrianni', '2003-01-30', '69247781000', true);


--Project
INSERT INTO PROJETO (ID, NOME, DATA_INICIO, DATA_PREVISAO_FIM, DATA_FIM, DESCRICAO, STATUS, ORCAMENTO, RISCO, IDGERENTE)
VALUES (2001, 'MAVEN', '2022-01-01', '2024-05-01', '2023-06-01', 'Manager Project', 'Iniciado', 2000.00, 'Baixo', 1000),
       (2002, 'JAVA', '2022-03-01', '2024-01-01', '2023-04-01', 'Manager Project', 'Iniciado', 4000.00, 'Alto', 1000),
       (2003, 'PYTHON', '2022-07-01', '2024-09-01', '2023-01-01', 'Manager Project', 'Iniciado', 5000.00, 'Alto', 1005),
       (2004, 'RUBY', '2022-08-01', '2024-07-01', '2023-02-01', 'Manager Project', 'Iniciado', 90000.00, 'Baixo', 1005),
       (2005, 'GO', '2022-09-01', '2024-05-01', '2023-07-01', 'Manager Project', 'Iniciado', 123000.00, 'Baixo', 1003),
       (2006, 'ANGULAR', '2022-04-01', '2024-04-01', '2023-09-01', 'Manager Project', 'Iniciado', 232000.00, 'Alto',
        1001),
       (2007, 'REACT', '2022-02-01', '2024-02-01', '2023-08-01', 'Manager Project', 'Iniciado', 9000.00, 'Alto', 1003);


-- --Member
--Member
INSERT INTO MEMBRO (ID, IDPROJETO, IDPESSOA)
VALUES (1, 2001, 1000),
       (2, 2001, 1002),
       (3, 2001, 1003),
       (4, 2001, 1004),
       (5, 2002, 1005),
       (6, 2002, 1006),
       (7, 2002, 1000),
       (8, 2003, 1003),
       (9, 2003, 1004),
       (10, 2003, 1005),
       (11, 2004, 1000),
       (12, 2004, 1003),
       (13, 2004, 1004),
       (14, 2005, 1005),
       (15, 2005, 1006),
       (16, 2005, 1001),
       (17, 2005, 1003),
       (18, 2006, 1004),
       (19, 2006, 1005),
       (20, 2006, 1006);