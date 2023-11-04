package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        int chiffre ;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print( "Veuillez saisir un entier, pour arrêter, taper 0 : " );
            chiffre = scanner.nextInt();
            if(chiffre>0) {
                for (int i = chiffre + 1; i <= chiffre + 10; i++) {
                    System.out.println(i);

                }
            }

        }while (chiffre > 0) ;
    }
}
