	INSERT INTO REPRESENTANTS (NR, NOMR, VILLE) VALUES (1, 'Stephane', 'Lyon');
    INSERT INTO REPRESENTANTS (NR, NOMR, VILLE) VALUES (2, 'Benjamin', 'Paris');
    INSERT INTO REPRESENTANTS (NR, NOMR, VILLE) VALUES (3, 'Leonard', 'Lyon');
    INSERT INTO REPRESENTANTS (NR, NOMR, VILLE) VALUES (4, 'Antoine', 'Brest');
    INSERT INTO REPRESENTANTS (NR, NOMR, VILLE) VALUES (5, 'Bruno', 'Bayonne');
    
    INSERT INTO PRODUITS (NP, NOMP, COUL, PDS) VALUES (1, 'Aspirateur', 'Rouge', 3546);
    INSERT INTO PRODUITS (NP, NOMP, COUL, PDS) VALUES (2, 'Trottinette', 'Bleu', 1423);
    INSERT INTO PRODUITS (NP, NOMP, COUL, PDS) VALUES (3, 'Chaise', 'Blanc', 3827);
    INSERT INTO PRODUITS (NP, NOMP, COUL, PDS) VALUES (4, 'Tapis', 'Rouge', 1423);
    
    INSERT INTO CLIENTS (NC, NOMC, VILLE) VALUES (1, 'Alice', 'Lyon');
    INSERT INTO CLIENTS (NC, NOMC, VILLE) VALUES (2, 'Bruno', 'Lyon');
    INSERT INTO CLIENTS (NC, NOMC, VILLE) VALUES (3, 'Charles', 'Compiegne');
    INSERT INTO CLIENTS (NC, NOMC, VILLE) VALUES (4, 'Denis', 'Montpellier');
    INSERT INTO CLIENTS (NC, NOMC, VILLE) VALUES (5, 'Emile', 'Strasbourg');
    
    INSERT INTO VENTES (NR, NP, NC, QT) VALUES (1, 1, 1, 1);
    INSERT INTO VENTES (NR, NP, NC, QT) VALUES (1, 1, 2, 1);
    INSERT INTO VENTES (NR, NP, NC, QT) VALUES (2, 2, 3, 1);
    INSERT INTO VENTES (NR, NP, NC, QT) VALUES (4, 3, 3, 200);
    INSERT INTO VENTES (NR, NP, NC, QT) VALUES (3, 4, 2, 190);
    INSERT INTO VENTES (NR, NP, NC, QT) VALUES (1, 3, 2, 300);
    INSERT INTO VENTES (NR, NP, NC, QT) VALUES (3, 1, 2, 120);
    INSERT INTO VENTES (NR, NP, NC, QT) VALUES (3, 1, 4, 120);
    INSERT INTO VENTES (NR, NP, NC, QT) VALUES (3, 4, 4, 2);
    INSERT INTO VENTES (NR, NP, NC, QT) VALUES (3, 1, 1, 3);
    INSERT INTO VENTES (NR, NP, NC, QT) VALUES (3, 4, 1, 5);
    INSERT INTO VENTES (NR, NP, NC, QT) VALUES (3, 1, 3, 1);
    
    SELECT * FROM formation2.VENTES