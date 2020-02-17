package com.algstructs.algs.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTest {

    @Test
    public void shouldFindElement() {
        int[] elements = {1, 2, 3, 5, 9, 12};
        int key = 3;

        boolean result = BinarySearch.searchIterative(elements, key);

        assertTrue(result);
    }

    @Test
    public void shouldNotFindElement() {
        int[] elements = {1, 2, 3, 5, 9, 12};
        int key = 6;

        boolean result = BinarySearch.searchIterative(elements, key);

        assertFalse(result);
    }

    @Test
    public void shouldFindElementRecursively() {
        int[] elements = {1, 2, 3, 5, 9, 12};
        int key = 3;

        boolean result = BinarySearch.searchRecursive(elements, key);

        assertTrue(result);
    }

    @Test
    public void shouldNotFindElementRecursively() {
        int[] elements = {1, 2, 3, 5, 9, 12};
        int key = 6;

        boolean result = BinarySearch.searchRecursive(elements, key);

        assertFalse(result);
    }
}