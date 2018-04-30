﻿
CREATE TABLE CLIENTE(
	CODIGO SERIAL PRIMARY KEY,
	NOME VARCHAR(255),
	IDENTIFICACAO VARCHAR(255),
	TELEFONE VARCHAR(255),
	CELULAR VARCHAR(255),
	EMAIL VARCHAR(255)
	
)
DROP TABLE CLIENTE
DELETE FROM CLIENTE
INSERT INTO CLIENTE(NOME, IDENTIFICACAO, TELEFONE, CELULAR, EMAIL) VALUES('MATHEUS', '10388767618', '3234212121', '32999998819', 'MATHEUS.PERES.ARAUJO@GMAIL.COM')
SELECT * FROM CLIENTE


CREATE TABLE EMPRESA(
	CODIGO SERIAL PRIMARY KEY,
	NOME VARCHAR(255),
	IDENTIFICACAO VARCHAR(255),
	LOGRADOURO VARCHAR(255),
	NUMERO INTEGER,
	COMPLEMENTO VARCHAR(255),
	BAIRRO VARCHAR(255),
	CIDADE VARCHAR(255),
	ESTADO VARCHAR(255),
	PAIS VARCHAR(255)
)
DROP TABLE EMPRESA
DELETE FROM EMPRESA
INSERT INTO EMPRESA(NOME, IDENTIFICACAO, LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, ESTADO, PAIS) VALUES('EMPRESA', '11111111111', 'ROMUALDO MENEZES', 288, 'NAO APLICAVEL', 'MENEZES', 'CATAGUASES', 'MINAS GERAIS', 'BRASIL')
SELECT * FROM EMPRESA


CREATE TABLE CONTRATO_ESTADO(
	CODIGO SERIAL PRIMARY KEY,
	DESCRICAO VARCHAR(64),
	DETALHAMENTO VARCHAR(255)
)
DROP TABLE CONTRATO_ESTADO
DELETE FROM CONTRATO_ESTADO
INSERT INTO CONTRATO_ESTADO(DESCRICAO, DETALHAMENTO) VALUES('ABERTO', 'CONTRATO AGUARDANDO DISPONIBILIDADE DE UM PROFISSIONAL DE COLETA');
INSERT INTO CONTRATO_ESTADO(DESCRICAO, DETALHAMENTO) VALUES('EM COLETA', 'PROFISSIONAL DE COLETA JÁ FOI DEFINIDO, AGUARDANDO FIM DA COLETA');
INSERT INTO CONTRATO_ESTADO(DESCRICAO, DETALHAMENTO) VALUES('COLETA FINALIZADA', 'COLETA FINALIZADA, AGUARDANDO DISPONIBILIDADE DE UM PROFISSIONAL DE ANALISE');
INSERT INTO CONTRATO_ESTADO(DESCRICAO, DETALHAMENTO) VALUES('EM ANALISE', 'PROFISSIONAL DE ANALISE JÁ DEFINIDO, AGUARDANDO ANALISE DAS AMOSTRAS');
INSERT INTO CONTRATO_ESTADO(DESCRICAO, DETALHAMENTO) VALUES('ANALISE FINALIZADA', 'ANALISE FINALIZADA, AGUARDANDO A DEMOSTRACAO DOS DADOS AO CLIENTE');
INSERT INTO CONTRATO_ESTADO(DESCRICAO, DETALHAMENTO) VALUES('FECHADO', 'SERVI;CO FINALIZADO');
SELECT * FROM CONTRATO_ESTADO


CREATE TABLE SERVICO(
	CODIGO SERIAL PRIMARY KEY,
	NOME VARCHAR(255)
)
DROP TABLE SERVICO
DELETE FROM SERVICO
INSERT INTO SERVICO(NOME) VALUES('pH');
INSERT INTO SERVICO(NOME) VALUES('Condutividade');
INSERT INTO SERVICO(NOME) VALUES('Oxigenio Dissovildo');
INSERT INTO SERVICO(NOME) VALUES('Reducao Permanganato');
INSERT INTO SERVICO(NOME) VALUES('Coliformes Totais');
INSERT INTO SERVICO(NOME) VALUES('Nitrogenio');
INSERT INTO SERVICO(NOME) VALUES('Cloretos');
INSERT INTO SERVICO(NOME) VALUES('Detergentes');
INSERT INTO SERVICO(NOME) VALUES('Dureza ou Alcalinidade');
INSERT INTO SERVICO(NOME) VALUES('Sólidos Dissolvidos');
INSERT INTO SERVICO(NOME) VALUES('Praguicidas');
INSERT INTO SERVICO(NOME) VALUES('Graxas e Azeites');
INSERT INTO SERVICO(NOME) VALUES('Sulfatos');
INSERT INTO SERVICO(NOME) VALUES('Nitratos');
INSERT INTO SERVICO(NOME) VALUES('Cianetos');
INSERT INTO SERVICO(NOME) VALUES('CO2 Livre');
INSERT INTO SERVICO(NOME) VALUES('Magnesio');
INSERT INTO SERVICO(NOME) VALUES('Fosfatos');
INSERT INTO SERVICO(NOME) VALUES('Nitritos');
INSERT INTO SERVICO(NOME) VALUES('DBO');
INSERT INTO SERVICO(NOME) VALUES('Cor');
INSERT INTO SERVICO(NOME) VALUES('Turbidez');
INSERT INTO SERVICO(NOME) VALUES('Sodio');
INSERT INTO SERVICO(NOME) VALUES('Calcio');
SELECT * FROM SERVICO


CREATE TABLE LOCAL(
	CODIGO SERIAL PRIMARY KEY,
	LOGRADOURO VARCHAR(255),
	NUMERO INTEGER,
	COMPLEMENTO VARCHAR(255),
	BAIRRO VARCHAR(255),
	CIDADE VARCHAR(255),
	ESTADO VARCHAR(255)

)
DROP TABLE LOCAL
DELETE FROM LOCAL
SELECT * FROM LOCAL


CREATE TABLE CONTRATO(
	CODIGO SERIAL PRIMARY KEY,
	COD_CLIENTE INTEGER,
	COD_EMPRESA INTEGER,
	COD_CONTRATO_ESTADO INTEGER,
	COD_LOCAL INTEGER,
	DESCRICAO VARCHAR(255),

	CONSTRAINT FK_CLIENTE FOREIGN KEY (COD_CLIENTE) REFERENCES CLIENTE(CODIGO),
	CONSTRAINT FK_EMPRESA FOREIGN KEY (COD_EMPRESA) REFERENCES EMPRESA(CODIGO),
	CONSTRAINT FK_CONTRATO_ESTADO FOREIGN KEY (COD_CONTRATO_ESTADO) REFERENCES CONTRATO_ESTADO(CODIGO),
	CONSTRAINT FK_LOCAL FOREIGN KEY (COD_LOCAL) REFERENCES LOCAL(CODIGO)
		
)
DROP TABLE CONTRATO
DELETE FROM CONTRATO
INSERT INTO CONTRATO(COD_CLIENTE, COD_EMPRESA, COD_CONTRATO_ESTADO, DESCRICAO) VALUES(2, 1, 1, 'CONTRATO')
SELECT * FROM CONTRATO 


CREATE TABLE CONTRATO_SERVICO(
	CODIGO SERIAL PRIMARY KEY,
	COD_CONTRATO INTEGER,
	COD_SERVICO INTEGER,

	CONSTRAINT FK_CONTRATO FOREIGN KEY (COD_CONTRATO) REFERENCES CONTRATO(CODIGO),
	CONSTRAINT FK_SERVICO FOREIGN KEY (COD_SERVICO) REFERENCES SERVICO(CODIGO)
)
DROP TABLE CONTRATO_SERVICO
DELETE FROM CONTRATO_SERVICO
SELECT * FROM CONTRATO_SERVICO


CREATE TABLE CARGO(
	CODIGO SERIAL PRIMARY KEY,
	NOME VARCHAR(255)
)
DROP TABLE CARGO
DELETE FROM CARGO
INSERT INTO CARGO(NOME) VALUES('PROFISSIONAL DE ANALISE');
INSERT INTO CARGO(NOME) VALUES('PROFISSIONAL DE COLETA')
SELECT * FROM CARGO


CREATE TABLE FUNCIONARIO(
	CODIGO SERIAL PRIMARY KEY,
	NOME VARCHAR(255),
	IDENTIFICACAO VARCHAR(255),
	COD_EMPRESA INTEGER,
	CARGO INTEGER,

	CONSTRAINT FK_EMPRESA FOREIGN KEY (COD_EMPRESA) REFERENCES EMPRESA(CODIGO)
			
)
DROP TABLE FUNCIONARIO
DELETE FROM FUNCIONARIO
INSERT INTO FUNCIONARIO(NOME, IDENTIFICACAO, COD_EMPRESA, CARGO) VALUES('MATHEUS', '10388767618', 3, 1)
SELECT * FROM FUNCIONARIO


CREATE TABLE AMOSTRA(
	CODIGO INTEGER PRIMARY KEY,
	DATA DATE,
	COD_CONTRATO INTEGER,
	COD_LOCAL INTEGER,
	COD_PROFISIONAL_COLETOR INTEGER,

	CONSTRAINT FK_CONTRATO FOREIGN KEY (COD_CONTRATO) REFERENCES CONTRATO(CODIGO)
	
)
DROP TABLE AMOSTRA
DELETE FROM AMOSTRA
SELECT * FROM AMOSTRA


CREATE TABLE ANALISE(
	CODIGO INTEGER PRIMARY KEY,
	COD_AMOSTRA INTEGER,
	COD_PROFISSIONAL_ANALISTA INTEGER,

	CONSTRAINT FK_AMOSTRA FOREIGN KEY (COD_AMOSTRA) REFERENCES AMOSTRA(CODIGO),
	CONSTRAINT FK_PROFISSIONAL_ANALISTA FOREIGN KEY (COD_PROFISSIONAL_ANALISTA) REFERENCES FUNCIONARIO(CODIGO)

)
DROP TABLE ANALISE
DELETE FROM ANALISE
SELECT * FROM ANALISE





