
    create table Address (
       id integer not null,
        street varchar(255),
        city_name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table Address_SEQ (
       next_val bigint
    ) engine=InnoDB;

    insert into Address_SEQ values ( 1 );

    create table City (
       name varchar(255) not null,
        primary key (name)
    ) engine=InnoDB;

    create table CollectedPack (
       id integer not null,
        description varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table CollectedPack_SEQ (
       next_val bigint
    ) engine=InnoDB;

    insert into CollectedPack_SEQ values ( 1 );

    create table Message (
       id integer not null,
        text varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table Message_SEQ (
       next_val bigint
    ) engine=InnoDB;

    insert into Message_SEQ values ( 1 );

    create table Pack (
       id binary(16) not null,
        description varchar(255),
        receptionCode integer not null,
        receiver_email varchar(255),
        id_receiver_machine binary(16),
        sender_email varchar(255),
        id_sender_machine binary(16),
        primary key (id)
    ) engine=InnoDB;

    create table PackMachine (
       id binary(16) not null,
        capacity integer not null,
        city_name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table Person (
       email varchar(255) not null,
        address_id integer,
        primary key (email)
    ) engine=InnoDB;

    alter table Address 
       add constraint FKke9nj7eag39250r0warvwmfg5 
       foreign key (city_name) 
       references City (name);

    alter table Pack 
       add constraint FK5c01mt2xpdrqqja20yae4tyb4 
       foreign key (receiver_email) 
       references Person (email);

    alter table Pack 
       add constraint FK62j5k402qh6q0awi5jdghwcf2 
       foreign key (id_receiver_machine) 
       references PackMachine (id);

    alter table Pack 
       add constraint FKs0ddtt8rq9g6y2c62iqvkcuhw 
       foreign key (sender_email) 
       references Person (email);

    alter table Pack 
       add constraint FKmwlfeekn1iecg55rro91akjx3 
       foreign key (id_sender_machine) 
       references PackMachine (id);

    alter table PackMachine 
       add constraint FK982k0pv4qvkwar707opkg2bxs 
       foreign key (city_name) 
       references City (name);

    alter table Person 
       add constraint FK6i7nduc8blbwp1dbfwavvnvvx 
       foreign key (address_id) 
       references Address (id);
