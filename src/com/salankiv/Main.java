package com.salankiv;

public class Main {

    public static void main(String[] args) {
        ArrayStructures newArray = new ArrayStructures();

        newArray.generateRandomArray();
        newArray.printHorzArray();
        newArray.insertionSort();

        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }

        BinarySearch binarySearch = new BinarySearch();

        System.out.println(binarySearch.search(array, 66));
    }
}
