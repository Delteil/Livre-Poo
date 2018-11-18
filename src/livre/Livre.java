/*Projet livre-poo
• Créer un repository dans GitHub avec le nom livre-poo
• Définir une classe Livre avec les attributs suivants : id, titre, auteur, prix.
• Définir les accesseurs aux différents attributs de la classe.
• Définir un constructeur permettant d’initialiser les attributs d'un objet livre par des
valeurs saisies par l’utilisateur, sachant que l’attribut id est auto-incrémenté lors de la
création d’un nouveau livre (le id d’un livre n’est pas saisi par l’utilisateur).
• Définir la méthode toString() permettant d’afficher les informations du livre en cours.
• Ecrire les commentaires Javadoc
• Ecrire un programme pour tester la classe Livre :
	o Créer des instances de la classe Livre
	o Mettre chacune de ces instances dans un tableau de type Livre, par exemple comme cela :
		Livre[] livres = new Livre[nbLivre] ;
	o Afficher le contenu du tableau et donc les caractéristiques de chacun des livres (cf. méthode toString() de la classe Livre).
	o Générer la Javadoc du programme.
*/

package livre;

public class Livre {

	// génération des attributs
	public static long id = 0; // id d’un livre n’est pas saisi par user donc static
	public static int nbLivre = 0; // nb de livre n'est pas saisi par user donc static
	public String titre = "";
	public String auteur = "";
	public double prix = -1;

	// génération du constructeur
	public Livre(String titre, String auteur, double prix) {
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		id++; // l’attribut "id" est auto-incrémenté lors de la création d’un nouveau livre
		nbLivre++; // nbLivre est d'incrémente lors de la création d'un nouveau livre
	}

	// création du toString
	public String toString() {
		return "Référence = " + id + ", Titre = " + titre + ", Auteur = " + auteur + ", Prix = " + prix + " Euros";
	}

	// affichage du coompteur Nbre Livre
	public static void afficheNbr() {
		System.out.println("Il y a " + nbLivre + " livre(s)");
	}

	// génération des getter/setter
	public static long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
}
