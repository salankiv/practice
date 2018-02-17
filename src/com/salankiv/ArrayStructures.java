package com.salankiv;

public class ArrayStructures {

    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int)(Math.random()*100) + 10;
        }
    }

    public void printArray() {
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("----------");
        }
    }

    public void printHorzArray() {
        for (int n = 0; n < 51; n++) {
            System.out.print("-");
        }

        System.out.println();

        for (int n = 0; n < arraySize; n++) {
            System.out.print("| " + n + "  ");
        }

        System.out.println("|");

        for (int n = 0; n < 51; n++) {
            System.out.print("-");
        }

        System.out.println();

        for (int n = 0; n < arraySize; n++) {
            System.out.print("| " + theArray[n] + " ");
        }

        System.out.println("|");

        for (int n = 0; n < 51; n++) {
            System.out.print("-");
        }

        System.out.println();
    }

    public void bubbleSort() {
        for (int i = arraySize -1; i > 1 ; i--) {
            for (int j = 0; j < i; j++) {
                if (theArray[j] > theArray[j+1]) {
                    swapValues(j, j+1);
                    printHorzArray();
                    System.out.println("i = " + i + " j = " + j);
                }
            }
        }
    }

    private void swapValues(int j, int i) {
        int temp = theArray[i];
        theArray[i] = theArray[j];
        theArray[j] = temp;
    }

    public void selectionSort() {
        for (int i = 0; i < arraySize; i++) {
            int minimum = i;

            for (int j = i; j < arraySize; j++) {
                if (theArray[minimum] > theArray[j]) {
                    minimum = j;
                }
            }
            swapValues(i, minimum);
            printHorzArray();
            System.out.println("i = " + i + " minimum = " + minimum);
        }
    }

    public void insertionSort() {
        for (int i = 1; i < arraySize; i++) {
            int j = i;
            int toInsert = theArray[i];
            while ((j > 0) && (theArray[j-1]) > toInsert) {
                theArray[j] = theArray[j-1];
                j--;
                printHorzArray();
            }
            theArray[j] = toInsert;
            printHorzArray();

            System.out.println("\nArray[i] = " + theArray[i] + " Array[j] = " + theArray[j] + " toInsert = " + toInsert + "\n");
        }
    }

}
