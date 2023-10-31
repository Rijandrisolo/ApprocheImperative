package fr.algorithmie;

public class AffichageInverse {

    /**Lecture inversée
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int i=0 ;

        System.out.println("lecture inversée");
        for (i= array.length-1;i>=0;i--) {

            System.out.println(array[i]);

        }
    }

}
