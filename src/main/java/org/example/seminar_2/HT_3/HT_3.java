/*
This class is the home task #3 for Geek Brains java beginner's seminar #2.
It generates an array of random integers
and replaces negative items of the array by the sum of indexes of 2-digit items.

 */

package org.example.seminar_2.HT_3;

public class HT_3 {
    public static void main ( String[] args ) {

        int numberOfItems = 100; //for example
        int absMaxValue = 1000;  //for example
        int [] numbersArray;
        numbersArray = fillArray (numberOfItems, absMaxValue);
        replaceNegativeItems (numbersArray);
//        for ( int i = 0 ; i < numbersArray.length ; i++ ) {
//            System.out.printf ( "item[%d] = %d\n", i, numbersArray[i] );
//        }
    }

    private static void replaceNegativeItems ( int[] numbersArray ) {
        int indexSum = 0;
        for ( int i = 0 ; i < numbersArray.length ; i++ ) {
            if (numbersArray[i] / 100 == 0) {
                indexSum += i;
            }
        }
        for ( int j = 0 ; j < numbersArray .length ; j++ ) {
            if (numbersArray [j] < 0) numbersArray [j] = indexSum;
        }
//        System.out.printf ( "index sum : %d\n", indexSum );
    }

    private static int[] fillArray (int numberOfItems , int absMaxValue ) {
        int[] resultArray = new int[numberOfItems];
        for ( int i = 0 ; i < numberOfItems ; i++ ) {
            resultArray[i] = (int)(Math.random () * absMaxValue - absMaxValue/2);
        }
        return resultArray;
    }
}
