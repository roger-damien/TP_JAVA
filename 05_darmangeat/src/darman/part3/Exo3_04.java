package darman.part3;

import java.util.Scanner;

public class Exo3_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Affiche "Ecrire un nomb2re: "
		System.out.println("Ecrire un nombre : ");
		int nombre = scanner.nextInt();

		if (nombre < 0) {
			System.out.println("Ce nombre est négatif");
		} else if (nombre == 0) {
			System.out.println("Ce nombre est nul");

		} else {
			System.out.println("Ce nombre est positif");
		}

	}
}

//Variable n en Entier
//Début
//Ecrire "Entrez un nombre : "
//Lire n
//Si n < 0 Alors
//  Ecrire "Ce nombre est négatif"
//SinonSi n = 0 Alors
// Ecrire "Ce nombre est nul"
//Sinon
//  Ecrire "Ce nombre est positif"
//Finsi
//Fin