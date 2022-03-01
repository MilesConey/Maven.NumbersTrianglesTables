package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String newTriangle = "";
        for(int i = 0; i < numberOfRows ; i++){
            for (int j = 0; j <= i; j++){
                newTriangle += "*";
            }
            newTriangle += "\n";
        }
        return newTriangle;
    }

    public static String getRow(int numberOfStars) {
        String newRow = "";
        for(int i = 0; i < numberOfStars; i++){
            newRow += "*";
        }
        return newRow;
    }

    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
