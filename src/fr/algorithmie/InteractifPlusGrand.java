package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {

        int chiffre;
        int maxi = 0;
        for (int i =0;i<=9;i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print( "Veuillez saisir un entier : " );
            chiffre = scanner.nextInt();
            if(maxi<chiffre){
                maxi=chiffre;
            }
        }
        System.out.print( "Le plus grand nombre est : "+ maxi);
    }
}
