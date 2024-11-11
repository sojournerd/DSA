package com.java;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
       // empty
    }

    public static int[] sort(int[] array) {
        quicksort(array, 0, array.length-1);
        return array;
    }

    public static void quicksort (int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex){
            return;
        }

        int pivot = array[highIndex];

        int lp = lowIndex;
        int rp = highIndex;

        while(lp < rp){                      
            
            while(array[lp] <= pivot && lp < rp){
                lp++;
            }

            while(array[rp] >= pivot && rp > lp){
                rp--;
            }
                    
            swap(array, lp, rp);
        }
       
        swap(array, lp, highIndex);
        quicksort(array, lowIndex, lp-1);
        quicksort(array, lp+1, highIndex);
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