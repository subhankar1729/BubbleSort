package com.company;

public class Main {


    public static void main(String[] args) {
        int array[] = new int[]{7, 2, 3, 1, 8, 9, 4, 5, 6};
        System.out.println("Before sorting the array: ");

        printArray(array);

        System.out.println("After sorting the array: ");
        bubbleShort(array);
        printArray(array);
    }

    static void printArray(int[] array){
        for (int i :
                array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void bubbleShort(int[] array){


        for (int i = 0; i<array.length-1; i++){
            for (int j = i+1; j<array.length; j++){
                if (array[i]<array[j]){
                    int str = array[i];
                    array[i] = array[j];
                    array[j] = str;
                }
            }printArray(array);
        }
    }


}
