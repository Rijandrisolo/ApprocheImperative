package fr.algorithmie;

public class InversionContenu {

    /**
     * Copie tableau inversée
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int l=  array.length;
        int[] arrayCopy = new int[l]; // Déclaration nouveau tableau
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {

                arrayCopy[j] = array[i]; //affectation valeur de array inversé dans arrayCopy
          j++;
        }
        for (int k = 0; k < array.length; k++) {
            System.out.println("array " + array[k]);
            System.out.println("arrayCopy " + arrayCopy[k]);
        }
    }
}
