package com.algstructs.algs.search;

public class BinarySearch {

    /**
     * Iterative binary search
     *
     * @param array array of SORTED array
     * @param key      value that should be found
     * @return true if key in array
     */
    public static boolean searchIterative(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int mid = left + ((right - left) / 2);
            if (array[mid] == key) {
                return true;
            } else if (key < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    /**
     * Recursive binary search
     *
     * @param array array of SORTED array
     * @param key      value that should be found
     * @return true if key in array
     */
    public static boolean searchRecursive(int[] array, int key) {
        return searchRecursive(array, key, 0, array.length - 1);
    }

    private static boolean searchRecursive(int[] elements, int key, int left, int right) {
        if (left > right) {
            return false;
        }

        int mid = left + ((right - left) / 2);
        if (elements[mid] == key) {
            return true;
        } else if (key < elements[mid]) {
            return searchRecursive(elements, key, left, mid - 1);
        } else {
            return searchRecursive(elements, key, mid + 1, right);
        }
    }
}

