create database cadastro_clientes;
use cadastro_clientes;

create table clientes(
	id int auto_increment primary key,
    nome varchar(255) not null,
    cpf varchar(11) not null,
    contato varchar(15) not null,
    email varchar(255) not null
);

INSERT INTO clientes (nome, cpf, contato, email) VALUES
    ('João da Silva', '12345678901', '(11) 99999-9999', 'joao@example.com'),
    ('Maria Souza', '98765432109', '(21) 88888-8888', 'maria@example.com');
    
select * from clientes;