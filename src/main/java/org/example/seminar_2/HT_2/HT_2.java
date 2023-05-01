package org.example.seminar_2.HT_2;
/*
This class is the home task #2 for Geek Brains java beginner's seminar #2.
It generates a sequence of random integers and checks if the sequence is increasing.

 */
public class HT_2 {
    public static void main ( String[] args ) {
        int sequenceLength = 3;
        int maxNumber = 10;
        System.out.printf ( "Is this sequence of numbers increasing? %b"
                , isSequenceInreasing(sequenceLength, maxNumber) );
    }

    private static boolean isSequenceInreasing ( int sequenceLength , int maxNumber ) {
        int previousNumber = (int) (Math.random () * maxNumber);
        for ( int i = 1 ; i < sequenceLength ; i++ ) {
            int currentNumber = (int) (Math.random () * maxNumber);
            if ( previousNumber >=  currentNumber) return false;
            previousNumber = currentNumber;
        }
        return true;
    }
}
