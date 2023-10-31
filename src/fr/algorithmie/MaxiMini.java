package fr.algorithmie;

public class MaxiMini {

    /** J'ai mis ensemble max, min, moyenne, somme tableau et affectation de total dans un autre tableau
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array1 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
        int[] array2 = new int[2]; // Déclaration tableau avec comme  élément la somme des 02 tableaux
        int maxi = 0; // déclaration élément maxi tableau array
        int mini = 0; // déclaration élément mini tableau array
        int sa = 0; // déclaration somme totale éléments tableau array
        int sa1 = 0;// déclaration somme totale éléments tableau array1
        float moy = 0; // déclaration moyenne éléments tableau array

        // Boucle calcul maxi, mini, et moy, sa, sa1

        for (int i=0 ;i<=array.length-1;i++) {
            if(array[i]>maxi) {
              maxi = array[i];
            }
            if(array[i]<mini) {
                mini = array[i];
            }
            moy += array[i];
            sa += array[i];
            sa1 += array1[i];
        }
        moy = moy/array.length;
        System.out.println("le plus grand élément de array est : " + maxi );
        System.out.println("le plus petit élément de array est : " + mini );
        System.out.println("la moyenne du tableau array est : " + moy );

        // affectation des valeurs aux éléments de array2
        array2[0] = sa;
        array2[1] = sa1;
        for (int i=0 ;i<=array2.length-1;i++) {
            System.out.println("Elément array2 index " + i + " est " + array2[i]);
        }

    }
}
