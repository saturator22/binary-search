package com.codecool;

public class BinarySearch {

    public static boolean binarySearch(int[] a, int value) {
        return binarySearch(a, 0, a.length -1, value);
    }

    public static boolean binarySearch(int[] a, int start, int end, int value) {
        int mid = (start + end) / 2;

        if(start > end) throw new IllegalArgumentException("There is no such value");

        if(a[mid] == value) {
            return true;
        } else if (a[mid] < value) {
            return binarySearch(a, mid + 1, end, value);
        } else {
            return binarySearch(a, start, mid - 1, value);
        }
    }
}
