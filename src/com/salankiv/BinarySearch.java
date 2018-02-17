package com.salankiv;

public class BinarySearch {

    public int search(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        boolean foundValue = false;
        int index = -1;

        while (low <= high && !foundValue) {
            if (low == high && array[low] == value) {
                foundValue = true;
                index = low;
            } else if (low == high && array[low] != value) {
                break;
            } else {
                int med = low / 2 + high / 2;
                if (array[med] == value) {
                    foundValue = true;
                    index = med;
                } else if (array[med] < value) {
                    low = med + 1;
                } else high = med - 1;

            }
        }

        return index;
    }
}