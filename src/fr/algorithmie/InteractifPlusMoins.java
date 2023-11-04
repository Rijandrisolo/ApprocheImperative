package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        int min = 1;
        int j =1;
        int max = 10;
        int chiffre = 0;
        int getRandomValue = 0;
        for (int i = min; i <= max; i++) {
            getRandomValue = (int) (Math.random() * (max - min)) + min;
        }
        //System.out.println(getRandomValue);
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Veuillez saisir un entier de 1 à 9, pour arrêter, entrez 0: ");
            chiffre = scanner.nextInt();
            if (chiffre <1) {
                System.out.println("Vous avez arrêté. Le chiffre était "+getRandomValue);
                break;
            }else if (chiffre < getRandomValue) {
                System.out.println("Vous êtes en dessous");
            } else if (chiffre > getRandomValue) {
                System.out.println("Vous êtes en dessus");
            } else {
                if(j>1) {
                    System.out.println("Vous avez gagné en " + j + " coups");
                }else{
                    System.out.println("Vous avez gagné en " + j + " coup");
                }
                break;
            }

            j++;
        } while (chiffre != 0 || chiffre < getRandomValue || chiffre > getRandomValue);
    }

    }
