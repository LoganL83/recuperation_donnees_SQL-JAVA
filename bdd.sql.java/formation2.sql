CREATE DATABASE formation2;

CREATE TABLE REPRESENTANTS (
NR INTEGER PRIMARY KEY,
NOMR VARCHAR (40),
VILLE VARCHAR (40)
);

CREATE TABLE PRODUITS (
NP INTEGER PRIMARY KEY,
NOMP VARCHAR (40),
COUL VARCHAR (40),
PDS INTEGER
);

CREATE TABLE CLIENTS (
NC INTEGER PRIMARY KEY,
NOMC VARCHAR (40),
VILLE VARCHAR (40)
);

CREATE TABLE VENTES (
NR INTEGER REFERENCES REPRESENTANTS (NR),
NP INTEGER REFERENCES PRODUITS (NP),
NC INTEGER REFERENCES CLIENTS (NC),
QT INTEGER,
PRIMARY KEY (NR, NP, NC)
);