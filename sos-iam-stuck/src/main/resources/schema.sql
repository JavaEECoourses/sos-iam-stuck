ThJWmd06C!

drop database sos;

create database sos;
connect database sos;


create table ADRESSE (
    ID_ADRESSE int PRIMARY KEY,
    LIBELE_ADRESSE varchar(100) NOT NULL,
    CODE_POSTALE varchar(50) NOT NULL,
    VILLE varchar(50) NOT NULL,
    PAYS varchar(50)  NOT NULL
);

create table AGENDA (
    ID_AGENDA INT PRIMARY KEY,
    DATE_DEBUT TIMESTAMP,
    DATE_FIN TIMESTAMP,
);

create Table Personne (
    idPersonne int AUTO_INCREMENT PRIMARY KEY,
    nom varchar(50) NOT NULL,
    prenom varchar(50) NOT NULL,
    email varchar(50) NOT NULL,
    telephone varchar(20) NOT NULL,
    rating INT
);
Create table UTILISATEUR (
        nbrIntervention INT
);


Create table DEPANNEUR (
       nbrIntervention INT
);