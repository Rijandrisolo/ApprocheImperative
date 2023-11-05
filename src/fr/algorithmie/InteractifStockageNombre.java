package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        int chiffre;
        int tableau[] = new int[3];
        int i;
        int n=0;
        System.out.println("La taille initiale du tableau est de "+tableau.length);
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.print(
                    "1. Ajouter un nombre dans le tableau\n\r" +
                            "2. Afficher le tableau \n\r" +
                            "0. Arrêter\n\r" +
                            "Taper un chiffre :");
            chiffre = scanner.nextInt();
            if (chiffre == 0) {

            } else if (chiffre == 1 && n<=tableau.length) {
                Scanner ajout = new Scanner(System.in);
                System.out.print("entrez le chiffre à ajouter au tableau :");
                int ajoutTableau = ajout.nextInt();

                    tableau[n] = ajoutTableau;
                    n++;
                    System.out.println("Vous avez encore : " +(tableau.length-n) + " saisie(s)");
                if(n==tableau.length){
                    Scanner ajoutTaille = new Scanner(System.in);
                    System.out.println("Vous devez modifier la taille du tableau si vous voulez continuer, Saisissez un nombre , 0 pour quitter");
                    int verif = ajoutTaille.nextInt();
                    if (verif !=0){
                        int[] newArr = Arrays.copyOf(tableau, tableau.length + verif);
                        tableau = newArr;
                        System.out.println("La nouvelle taille du tableau est :"+tableau.length);
                    }
                }



            } else if (chiffre == 2) {
                for (i = 0; i <= tableau.length - 1; i++) {

                    if(tableau[i] !=0) {
                        System.out.println("tableau["+i+"] :" +tableau[i]);

                    }
                }
                System.out.println(tableau.length);
            } else {
                System.out.println("Choix incorrect");
            }
        }while(chiffre!=0);
    }
}
