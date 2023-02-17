package com.program1;

import java.util.Map;
import java.util.HashMap;

public  abstract class Fibonacci{
    protected Map<Integer, Integer> memoCache;

    /**
     * Constructs a new instance of the abstract Fibonacci calculator class with an
     * empty memoization map.
     */
    public Fibonacci() {
        memoCache = new HashMap<>();
        memoCache.put(0, 0);
        memoCache.put(1, 1);
    }


    /**
     * Calculates the nth number in the Fibonacci sequence.
     *
     * @param number the index of the desired number in the Fibonacci sequence
     * @return The nth number in the Fibonacci sequence
     */
    public int calculate(int number) {
        if (memoCache.containsKey(number)) {
            return memoCache.get(number);
        }

        int result = calculate(number - 1) + calculate(number - 2);
        memoCache.put(number, result);
        return result;
    }

    /**
     * Calculates a range of numbers in the Fibonacci sequence.
     *
     * @param start the starting index of the range (inclusive)
     * @param end   the ending index of the range (inclusive)
     * @return an array containing the Fibonacci numbers in the specified range
     * @throws IllegalArgumentException if start or end are negative, or if end is
     *                                  less than start
     */
    public abstract int[] calculateRange(int start, int end)  throws IllegalArgumentException;
}
