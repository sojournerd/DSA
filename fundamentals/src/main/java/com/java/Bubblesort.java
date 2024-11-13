package com.java;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
       // empty
    }

    public static int[] sort(int[] array) {
        bubbleSort(array);
        return array;
    }

    public static void bubbleSort (int[] array) {
        if (array.length == 1) return;
        
        for(int i = 0; i < array.length; i++){
            int j = i+1;
            while(j <= array.length-1){
                if(array[i] > array[j]){
                    swap(array, i, j);
                }
                j++;
            }
        }
        printArray(array);
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
