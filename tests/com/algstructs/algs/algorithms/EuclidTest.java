package com.algstructs.algs.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EuclidTest {

    @Test
    public void shouldReturnGsd() {
        int gcd = Euclid.gcd(9, 12);
        assertEquals(3, gcd);
    }
}