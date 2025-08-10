// Last updated: 7/31/2025, 12:22:27 PM
class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Get absolute values and handle edge case for Integer.MIN_VALUE
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        // Initialize result
        int result = 0;

        // Perform division using bit shifting
        while (absDividend >= absDivisor) {
            long temp = absDivisor;
            int multiple = 1;

            // Find the largest multiple
            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            // Subtract the largest multiple from the dividend
            absDividend -= temp;
            result += multiple;
        }

        // Determine the sign of the result
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            return -result;
        } else {
            return result;
        }
    }
}
