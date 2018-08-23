package demojdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbc1 {

	public static void main(String[] args) {

		// 1ere étape : connexion
		String url = "jdbc:mysql://localhost/formation2?useSSL=false";
		String user = "root";
		String pwd = "";

		// 2nde étape : chargement du driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pwd);
			Statement st = cn.createStatement();
			String sql = "SELECT * FROM formation2.clients";

			// nouvelle variable (2)
			String sqlRouge = "SELECT NP, NOMP FROM formation2.produits WHERE COUL= 'Rouge' AND PDS>2000";

			// nouvelle variable (3)
			String sqlVente = "SELECT NOMR FROM formation2.representants\r\n"
					+ "INNER JOIN ventes ON representants.NR = ventes.NR\r\n" + "GROUP BY NOMR";

			// nouvelle variable (4)
			String sqlLyon = "SELECT NOMC FROM formation2.clients\r\n"
					+ "INNER JOIN formation2.ventes ON ventes.nc=clients.nc\r\n" + "WHERE VILLE='Lyon' AND QT>180\r\n"
					+ "GROUP BY NOMC";

			// nouvelle variable (5)
			String sqlRepCli = "SELECT DISTINCT NOMR, NOMC FROM (((formation2.VENTES\r\n"
					+ "INNER JOIN formation2.CLIENTS ON VENTES.NC = CLIENTS.NC)\r\n"
					+ "INNER JOIN formation2.PRODUITS ON VENTES.NP = PRODUITS.NP)\r\n"
					+ "INNER JOIN formation2.REPRESENTANTS ON VENTES.NR = REPRESENTANTS.NR)\r\n"
					+ "WHERE COUL='Rouge' AND QT>100";

			//
			ResultSet result = st.executeQuery(sql);
			//
			int ncVar;
			String nomcVar;
			String villeVar;

			// nouvelle requete sqlRouge
			int npVar;
			String nompVar;

			// nouvelle requête sqlVente
			String nomrVar;

			// nouvelle requête sqlLyon
			String nomc1Var;

			// nouvelle requête sqlRepCli
			String nomRepresentant;
			String nomClient;

			while (result.next()) {
				// recuperer le "nc"
				ncVar = result.getInt("nc");
				// recuperer le "nomc"
				nomcVar = result.getString("nomc");
				// recuperer "ville"
				villeVar = result.getString("ville");
				System.out.println("Numero Client : " + ncVar + ", NomClient : " + nomcVar + ", Ville : " + villeVar);

			}
			// nouvelle requête (2)
			ResultSet result2 = st.executeQuery(sqlRouge);
			while (result2.next()) {
				// recuperer le NP
				npVar = result2.getInt("np");
				// recuperer le nom du produit
				nompVar = result2.getString("nomp");
				System.out.println("Numéro produit : " + npVar + " Nom du produit : " + nompVar
						+ " /produit de couleur rouge et d'un poids supérieur à 2000grammes.");
			}
			// nouvelle requête (3)
			ResultSet result3 = st.executeQuery(sqlVente);
			while (result3.next()) {
				// recuperer nom du représentant
				nomrVar = result3.getString("nomr");
				System.out.println(nomrVar + " est un représentant ayant vendu au moins un produit");
			}
			// nouvelle requête (4)
			ResultSet result4 = st.executeQuery(sqlLyon);
			while (result4.next()) {
				// recuperer nom du client
				nomcVar = result4.getString("nomc");
				System.out.println(
						nomcVar + " est un client de Lyon ayant acheté un produit pour une quantité superieur à 180.");
			}
			// nouvelle requête (5)
			ResultSet result5 = st.executeQuery(sqlRepCli);
			while (result5.next()) {
				// recuperer nom representant
				nomClient = result5.getString("nomc");
				// recuperer nom client
				nomRepresentant = result5.getString("nomr");
				System.out.println(
						nomClient + " a achete un produit de couleur rouge pour une quantité superieure a 100 à "
								+ nomRepresentant);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
