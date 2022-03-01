package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getEvenNumbers(int start, int stop) {
        String newStringToHoldEvenNumbers = "";
        for (int i = start; i < stop; i++) { //A for loop is needed to produce a range of numbers
            if (i % 2 == 0) {
                newStringToHoldEvenNumbers += i;
            }
        }
        return newStringToHoldEvenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String newStringToHoldOddNumbers = "";
        for (int i = start; i < stop; i++) { //A for loop is needed to produce a range of numbers
            if (i % 2 != 0) {  // ! denotes not equal to, alternative could be i % 2 == 1;
                newStringToHoldOddNumbers += i;
            }
        }
        return newStringToHoldOddNumbers;

    }


    public static String getSquareNumbers(int start, int stop, int step) { // step refers to increments of a specified amount, step here is replacing the incrementer i++
        String newStringToHoldSquareNumbers = "";
        for (int i = start; i < stop; i += step) { //A for loop is needed to produce a range of numbers
            newStringToHoldSquareNumbers += (int) Math.pow(i, 2);  // By adding (int), this allows me to "cast" the double output from Math.pow to an int value, which is needed because of my parameters
        }
        return newStringToHoldSquareNumbers;
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String newStringToHoldExponentsNumbers = "";
        for (int i = start; i < stop; i += step) { //A for loop is needed to produce a range of numbers
            newStringToHoldExponentsNumbers += (int) Math.pow(i, exponent);  // By adding (int), this allows me to "cast" the double output from Math.pow to an int value, which is needed because of my parameters
        }
        return newStringToHoldExponentsNumbers;
    }

    public static String getRange(int stop) {
        String newRange = "";
        for (int i = 0; i < stop; i++) { //A for loop is needed to produce a range of numbers
            newRange += i;
        }
        return newRange;

    }

    public static String getRange(int start, int stop) {
        String rangeString = "";
        for (int i = start; i < stop; i++) {
            rangeString += i;
        }
        return rangeString;

    }


    public static String getRange(int start, int stop, int step) {
        String rangeString = "";
        for (int i = start; i < stop; i += step) {
            rangeString += i;
        }
        return rangeString;

    }
}