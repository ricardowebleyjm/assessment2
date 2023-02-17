package com.program1;

public class MemoizedFibonacci extends Fibonacci{
    /**
     * Calculates a range of numbers in the Fibonacci sequence.
     *
     * @param start the starting index of the range (inclusive)
     * @param end   the ending index of the range (inclusive)
     * @return an array containing the Fibonacci numbers in the specified range
     * @throws IllegalArgumentException if start or end are negative, or if end is
     *                                  less than start
     */
    @Override
    public int[] calculateRange(int start, int end) throws IllegalArgumentException {
        if (start < 0 || end < 0) {
            throw new IllegalArgumentException("Start and end must be non-negative integers");
        }
        if (end < start) {
            throw new IllegalArgumentException("End must be greater than or equal to start");
        }

        int[] result = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            result[i - start] = calculate(i);
        }
        return result;
    }
}
