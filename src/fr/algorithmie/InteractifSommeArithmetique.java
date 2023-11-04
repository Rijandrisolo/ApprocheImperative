package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        int chiffre ;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print( "Veuillez saisir un entier, pour arrêter, taper 0 : " );
            chiffre = scanner.nextInt();

            if(chiffre>0) {
                System.out.println("Chiffre début : "+chiffre);
                for (int i = chiffre-1 ; i > 0; i--) {
                    chiffre+=i;

                }
                System.out.println("Chiffre additionné : "+chiffre);
            }

        }while (chiffre > 0) ;
    }
}
