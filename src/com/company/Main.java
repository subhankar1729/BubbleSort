package com.company;

public class Main {
    public static void main(String[] args) {
        // Getting anonymous array as array input
        int array[] = new int[]{7, 2, 3, 1, 8, 9, 4, 5, 6};

        // Printing the elements of the array before sorting by calling the printing method
        System.out.println("Before sorting the array: ");
        printArray(array);

        //Calling the sorting method
        bubbleShort(array);

        //Printing the elements of the array after sorting by calling the method
        System.out.println("After sorting the array: ");
        printArray(array);
    }

    //Method for printing any array
    static void printArray(int[] array){
        // For-each loop to print the elements of any array
        for (int i :
                array) {
            System.out.print(i+" ");
        }
        // Statement to get into the nextLine.
        System.out.println();
    }
    //Method for Bubble sort
    static void bubbleShort(int[] array){
        boolean flag = false;
        int str;
        while (!flag){
            for (int i = 0; i<array.length-1; i++){
                for (int j = i+1; j<array.length; j++){
                    if (array[i]<array[j]) {
                        str = array[i];
                        array[i] = array[j];
                        array[j] = str;
                        flag = true;
                    }
                }
            }
        }
    }
}
