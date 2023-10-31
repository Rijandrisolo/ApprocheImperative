package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
      int[] array = {0,1,2,3};
        System.out.println("Array avant rotation");
        for(int l = 0; l < array.length; l++) {
            System.out.println(array[l]);
        }

        int last= array[0];
        for(int i = 1; i < array.length; i++){
            int tmp = array[i];
            array[i] = last;
            if (i == array.length-1){
                array[0] = tmp;
            } else {
                last = tmp;
            }
        }
        System.out.println("Array après rotation");
        for(int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }
}
