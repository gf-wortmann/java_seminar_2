package org.example.seminar_2.ht_1;

import java.util.Locale;

/*
This class is the home task #1 for Geek Brains java beginner's seminar #2.
It generates a sequence of random integers and calculates the sum of the simple numbers, happened in the sequence.

 */
public class HT_1 {
    public static void main ( String[] args ) {

        int sequenceLength = 1_000_000;
        int maxNumber = 1_000_000;
        long simplexNumCounter = 0;

        for ( int i = 0 ; i < sequenceLength ; i++ ) {
            int n = (int) (Math.random () * (maxNumber-1)+1);
            if (isSimple(n)) {
                simplexNumCounter += n;
            }
        }
        System.out.printf ( Locale.GERMANY
                , "The sum of all simple numbers in the sequence is equal: %,d%n"
                , simplexNumCounter );
    }

    private static boolean isSimple ( int i ) {
        if (i < 4) return true;
        for ( int j = 2 ; j <= Math.sqrt (i) ; j++ ) {
            if (i % j == 0) return false;
            }
        return true;
        }
}
