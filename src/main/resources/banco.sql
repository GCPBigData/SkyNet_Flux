create table skynet.tecnico
(
    id                  serial not null
        constraint tecnicos_pkey
            primary key,
    nome                varchar(50),
    rg                varchar(50),
    cpf               varchar(14),
    data_nascimento   date,
    mae               varchar(45),
    endereco          varchar(45),
    cidade            varchar(45),
    estado            varchar(45),
    pais              varchar(45),
    telefone          varchar(40),
    banco             varchar(40),
    agencia           varchar(20),
    conta             varchar(40),
    titular_conta     varchar(40),
    cpf_titular_conta varchar(14),
    valor_chamado     numeric(15, 2),
    valor_hora        numeric(15, 2),
    valor_mensal      numeric(15, 2)
);

alter table skynet.tecnico
    owner to postgres;

create table skynet.login_user
(
    id          integer not null
        constraint login_user_pk
            primary key,
    name        varchar(100),
    username    varchar(100),
    password    varchar(100),
    authorities varchar(100)
);

alter table skynet.login_user
    owner to postgres;


