package Semana10;

import java.util.ArrayList;

public class S10Sesion1Ejercicio2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,4,6,8,10,12,14,16,18,20};

        ArrayList<Integer> miArrayList = new ArrayList<>();

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]) miArrayList.add(arr1[i]);
            }
        }
        System.out.println(miArrayList);
    }
}
