package com.fourmob.datetimepicker;

public final class ArrayUtils {

    private ArrayUtils() {
    }

    public static boolean contains(int[] arr, int value) {
        for (int i1 : arr) {
            if (i1 == value) {
                return true;
            }
        }
        return false;
    }
}
