package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
       return getMultiplicationTable(10);

    }

    public static String getMultiplicationTable(int tableSize) {
        String multipleTable = "";
        for(int i = 1; i <= tableSize; i++) {  //nested for loop
           for(int j = 1; j <= tableSize; j++ ){
                multipleTable += String.format("%3s ", (i * j)) + "|"; // %3s is a string right-aligned until its at least 3 characters long
            }
           multipleTable += "\n"; //\n is an escape character for strings that is replaced with the new line object.
        }
        return multipleTable;
    }
}
