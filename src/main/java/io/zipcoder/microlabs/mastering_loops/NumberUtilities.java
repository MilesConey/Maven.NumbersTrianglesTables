package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    static double output;

    public static String getEvenNumbers(int start, int stop) {
       String output = "";
        for (int i = start; i < stop; i++) {
             if (i % 2 == 0) {
                output += i; //This is the same as output = output + i
             }
        }
        return output;
    }



    public static String getOddNumbers(int start, int stop) {
        String output = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 1) {
                output += i; //This is the same as output = output + i
            }
        }
        return output;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String output = "";
        for (int i = start; i < stop; i += step) {
           output += (int) Math.pow(i,2);
        }
        return output;
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String output = "";
        for (int i = start; i < stop; i += step) {
            output += (int) Math.pow(i,exponent);
        }
        return output;
    }

    public static String getRange(int stop) {
        String output = "";
        for (int i = 0; i < stop; i++) {
            output += i;
        }
        return output;
    }

    public static String getRange(int start, int stop) {
        String output = "";
        for (int i = start; i < stop; i++) {
            output += i;
        }
        return output;
    }


    public static String getRange(int start, int stop, int step) {
        String output = "";
        for (int i = start; i < stop; i += step) {
            output += i;
        }
        return output;
    }



}
