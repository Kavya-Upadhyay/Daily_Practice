// Last updated: 7/31/2025, 12:22:06 PM
class Solution {
    public double myPow(double x, int n) {
        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double result = 1;
        double current_product = x;
        while (n > 0) {
            if (n % 2 == 1) {
                result = result * current_product;
            }
            current_product = current_product * current_product;
            n = n / 2;
        }
        return result;
    }
}