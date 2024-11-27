package com.java;
public class Mergesort {

    public static void main(String args) {
       // main 
    }

    public static int[] sort(int[] array) {
        MergeSort(array, array.length);
        return array;
    }

    public static void MergeSort(int[] array, int n) {
       if(array.length <= 1) return; // if array is only 1 element: return
       
       //divide array into left half and right half at midpoint
       int midpt = n / 2;
       int[] left = new int[midpt]; 
       int[] right = new int [n - midpt];

        for(int i = 0; i < midpt; i++){
            left[i] = array[i];
        }

        for(int j = midpt; j < n; j++){
            right[j - midpt] = array[j];
        }

        MergeSort(left, midpt);
        MergeSort(right, n - midpt);

        merge(array, left, right, midpt, n-midpt);
    }

    public static void merge(int[] array, int[] left, int[] right, int lSize, int rSize){

        int ls = 0, rs = 0, k = 0;
        
        while (ls < lSize && rs < rSize) {
            if(left[ls] <= right[rs])
                array[k++] = left[ls++];
            else
                array[k++] = right[rs++];
        }

        // traverse & merge the rest of left subarray
        while (ls < lSize) {
            array[k++] = left[ls++];
        }

        while (rs < rSize) {
            array[k++] = right[rs++];
        }
    }
    
}
