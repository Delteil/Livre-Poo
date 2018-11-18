/*Ecrire un programme pour tester la classe Livre :
	o Créer des instances de la classe Livre
	o Mettre chacune de ces instances dans un tableau de type Livre, par exemple comme cela :
		Livre[] livres = new Livre[nbLivre] ;
	o Afficher le contenu du tableau et donc les caractéristiques de chacun des livres (cf. méthode toString() de la classe Livre).
	o Générer la Javadoc du programme.
*/

package livre;

import livre.Livre;

public class TestLivre {

	public static void main(String[] args) {

		Livre livre1 = new Livre("Le jeu", "Anders de la Motte", 20.0);
		Livre livre2 = new Livre("Puzzle", "Thilliez", 19.50);
		Livre livre3 = new Livre("Conjuration primitive", "Chattam", 21.90);
		
		Livre[] livres = { livre1, livre2, livre3 };

		
		for (int i = 0; i < livres.length; i++) {

			System.out.println(livres[i].toString());
			//System.out.println(livres[i].getId());
			//System.out.println(Livre.getId());

		}
		//System.out.println(livres[0].toString());
		
		Livre.afficheNbr();
		
	}
}
