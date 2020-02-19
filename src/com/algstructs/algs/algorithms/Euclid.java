package com.algstructs.algs.algorithms;

/**
 * Compute the greatest common divisor of
 * two non negative integers p and q as follows:
 * If q is 0, the answer is p. If not, divide p by q
 * and take the remainder r. The answer is the
 * greatest common divisor of q and r.
 */
public class Euclid {

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
