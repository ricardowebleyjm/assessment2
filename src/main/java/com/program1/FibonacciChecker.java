package com.program1;

public class FibonacciChecker extends Fibonacci{
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
        // Check that start and end are not negative numbers
        if (start < 0 || end < 0) {
            throw new IllegalArgumentException("Start and end must be non-negative integers");
        }
        // Check that end is greater than or equal to start
        if (end < start) {
            throw new IllegalArgumentException("End must be greater than or equal to start");
        }
        // Create an array of type int to store the result
        int[] result = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            // Calculate the result for the current number in the range
            result[i - start] = calculate(i);
        }
        return result;
    }
}
