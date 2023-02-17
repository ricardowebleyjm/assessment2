package com.program2;

public class Sorter extends BubbleSort {

    /**
     * @param array
     * @param reverseOrder
     */
    @Override
    public void sort(String[] array, boolean reverseOrder) {
        int n = array.length; //getting the length of the array
        for (int counter = 0; counter < n - 1; counter++){
            for (int j = 0; j < n - counter - 1; j++){
                if (reverseOrder && array[j].compareTo(array[j + 1]) > 0){
                    String temp = array[j];
                    // Swap arr[j] and arr[j+1]
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }else if (!reverseOrder  && array[j].compareTo(array[j + 1]) < 0){
                    String temp = array[j];
                    // Swap arr[j] and arr[j+1]
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
