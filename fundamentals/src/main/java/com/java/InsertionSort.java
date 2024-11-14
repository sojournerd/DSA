package com.java;

import java.util.Arrays;

public class InsertionSort {
       public static void main(String[] args) {
       // empty
    }

    public static int[] sort(int[] array) {
        insertionSort(array);
        return array;
    }

    public static void insertionSort (int[] array) {
        if (array.length == 1) return;
        
        for(int i = 0; i < array.length; i++){
            int j = i+1;
            int lowest = i;
            while(j <= array.length-1){
                if(array[j] < array[lowest]){
                    lowest = j;
                }
                j++;
            }
            swap(array, i, lowest);
        }
        return;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return;
    }

    private static void printArray(int[] array){
        Arrays.stream(array).forEach(num -> System.out.print(num + " ")); 
        System.out.println();
    }
}
