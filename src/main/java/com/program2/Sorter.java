package com.program2;

public class Sorter extends BubbleSort {

    /**
     * Sorts an array of String in reverse order or alphabetical order.
     * A boolean value is used to determine the order the String of array should be sorted.
     * <br/>
     * This sort method has a time complexity of O(n^2)
     * @param array
     * @param reverseOrder
     */
    @Override
    public void sort(String[] array, boolean reverseOrder) {
        int n = array.length; // getting the length of the array
        for (int counter = 0; counter < n - 1; counter++){ // iterate over the array
            for (int j = 0; j < n - counter - 1; j++){ // compare adjacent elements
                // if reverseOrder is true and element at index j is greater than the next element, swap the elements
                if (reverseOrder && array[j].compareTo(array[j + 1]) > 0){
                    String temp = array[j];
                    // Swap arr[j] and arr[j+1]
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                // if reverseOrder is false and element at index j is less than the next element, swap the elements
                else if (!reverseOrder && array[j].compareTo(array[j + 1]) < 0){
                    String temp = array[j];
                    // Swap arr[j] and arr[j+1]
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
