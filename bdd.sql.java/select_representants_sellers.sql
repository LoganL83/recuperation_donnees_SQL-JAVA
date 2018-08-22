SELECT NOMR FROM formation2.representants
INNER JOIN ventes ON representants.NR = ventes.NR
GROUP BY NOMR;