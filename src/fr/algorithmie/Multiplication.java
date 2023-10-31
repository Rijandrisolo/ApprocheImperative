package fr.algorithmie;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        try ( Scanner scanner = new Scanner( System.in )){

        System.out.print( "Veuillez saisir un entier : " );
        int chiffre = scanner.nextInt();

        if(chiffre>=1 && chiffre <= 10) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(chiffre + " * " + i + " = " + chiffre * i);
            }
        }else{
            System.out.println("Chiffre invalide");
        }
    }
    }
}
