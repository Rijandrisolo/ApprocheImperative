package fr.algorithmie;

public class ComparaisonTableau {
    /**Comparaison Tableau
     *
     * @param args
     */
        public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 14, 2, 11, -5, -4, 8} ;
        int k = 0;
        for(int i=0;i <=array2.length-1;i++) {

                    for (int j = 0; j <= array1.length-1; j++) {
                        if (array2[i] == array1[j]) {
                            k++;
                        }
                    }
        }
        System.out.println( k +" Eléments en commun");
    }
}
