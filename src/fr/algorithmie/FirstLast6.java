package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        //int[] array = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
        int[] array = new int[0];
        //int[] array = {6, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
        //int[] array = {1, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 6} ;
        boolean val = false;
        if(array.length>0 && (array[0]==6 || array[array.length-1]==6)){
            val=true;
        }


        System.out.println(val);
    }

}
