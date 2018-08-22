SELECT NOMC FROM formation2.clients
INNER JOIN formation2.ventes ON ventes.nc=clients.nc
WHERE VILLE='Lyon' AND QT>180
GROUP BY NOMC;
