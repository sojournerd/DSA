package com.java;

/*
 *  we assume the array is sorted; time complexity should be log(n)
 *  if array was unsorted, we sort in best case complexity nlog(n) thus => nlog(n) for search
 */

public class BinarySearch {
    public static void main(String[] args) {
        // empty
    }

    public static int binarySearchIterative (int[] array, int target) {
        int left = 0;
        int right  = array.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(array[mid] == target){
                return mid;
            }
            else if (array[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static String binarySearchRecursive(int[] array, int target, int start, int end){

        int mid = (start + end) / 2;

        if(end >= start && start <= array.length-1){

            if(array[mid] == target){
                return String.format("{true:%d}", mid);
            }
            if(array[mid] > target){
                return binarySearchRecursive(array, target, start, mid - 1);
            } 
            else if(array[mid] < target){
                return binarySearchRecursive(array, target, mid + 1, end);
            }
        }

        return String.format("{false:%d}", -1);
    }

}
