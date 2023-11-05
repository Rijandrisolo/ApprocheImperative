package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        int chiffre;
        int tableau[] = new int[3];
        int i;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print(
                    "1. Ajouter un nombre dans le tableau\n\r" +
                            "2. Afficher le tableau \n\r" +
                            "0. Arrêter\n\r" +
                            "Taper un chiffre :");
            chiffre = scanner.nextInt();
            if (chiffre == 0) {

            } else if (chiffre == 1) {
                Scanner ajout = new Scanner(System.in);
                System.out.print("entrez le chiffre à ajouter au tableau :");
                int ajoutTableau = scanner.nextInt();
                tableau[0] = (ajoutTableau);

                System.out.println(ajoutTableau);
                System.out.println(tableau.length);

            } else if (chiffre == 2) {
                for (i = 0; i <= tableau.length - 1; i++) {
                    if(tableau[i] !=0) {
                        System.out.println(tableau[i]);
                    }
                }
            } else {
                System.out.println("Choix incorrect");
            }
        }while(chiffre!=0);
    }
}
