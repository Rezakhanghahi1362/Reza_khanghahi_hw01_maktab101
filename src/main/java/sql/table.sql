
CREATE table if not EXISTS users(

    id serial primary key ,
    name varchar(50) not null ,
    username varchar(50) not null ,
    email varchar(50) not null ,
    password varchar(50) not null

);

create table if not exists category(
id serial primary key ,
name varchar(50) not null,
description varchar(50)
);


create table if not exists brand(

    id          serial primary key,
    name        varchar(50) not null,
    website     varchar(50) not null,
    description varchar(50)
);


create table if not exists shareholder(
    id serial primary key ,
    name varchar(50)not null ,
    phoneNumber varchar(50)not null ,
    nationalCode varchar(50)not null
);

create table if not exists shareholder_brand(
    id serial primary key ,
    shareHolderId int references shareholder (id),
    brandId int references brand(id)
);

create table if not exists product
(
    id          serial primary key,
    name        varchar(50) not null,
    createDate  varchar(50),
    category_id int references category (id),
    brand_id    int references brand (id)







);