CREATE DATABASE SportFlowDB;
USE SportFlowDB;


CREATE TABLE Members (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50) NOT NULL,
    dateNaissance DATE NOT NULL,
    sport VARCHAR(50) NOT NULL
);

CREATE TABLE Entraineurs (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50) NOT NULL,
    specialite VARCHAR(50) NOT NULL
);

CREATE TABLE Seances (
    id INT PRIMARY KEY AUTO_INCREMENT,
    member_id INT NOT NULL,
    entraineur_id INT NOT NULL,
    dateHeure DATETIME NOT NULL,
    FOREIGN KEY (member_id) REFERENCES Members(id) ON DELETE CASCADE,
    FOREIGN KEY (entraineur_id) REFERENCES Entraineurs(id) ON DELETE CASCADE
);

CREATE TABLE Users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    role ENUM ('Admin', 'Member', 'Entraineur') ,
    member_id INT,
    entraineur_id INT,
    FOREIGN KEY (member_id) REFERENCES Members(id) ON DELETE CASCADE,
    FOREIGN KEY (entraineur_id) REFERENCES Entraineurs(id) ON DELETE CASCADE);




SELECT * FROM Users;
SELECT * FROM Members;
SELECT * FROM Entraineurs;
SELECT * FROM Seances;

 -- drop database sportflowdb;
SHOW TABLES;