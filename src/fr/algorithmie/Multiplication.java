package fr.algorithmie;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        int chiffre ;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print( "Veuillez saisir un entier entre 1 et 10 : " );
             chiffre = scanner.nextInt();

            if(chiffre>=1 && chiffre <= 10) {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(chiffre + " * " + i + " = " + chiffre * i);
                }
            }else{
                System.out.println("Chiffre invalide");
            }

        }while (chiffre > 0 && chiffre <= 10) ;


    }
}

