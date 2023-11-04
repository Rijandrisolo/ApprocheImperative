package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        int nombre ;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.printf("Ecrire un nombre: ");
            nombre = scanner.nextInt();
            if (nombre > 0 && nombre <= 10) {
                System.out.println("le nombre saisi est : " + nombre + " et est entre 1 à 10");

            } else {
                System.out.println("le nombre saisi est : " + nombre + " et n'est pas entre 1 à 10");
            }


        }while (nombre > 0 && nombre <= 10) ;
    }
}
