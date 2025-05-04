public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;  // Base case: x^0 = 1
        if (n < 0) {
            x = 1 / x;  // If n is negative, invert x and make n positive
            n = -n;
        }
        return fastPow(x, n);
    }

    private double fastPow(double x, int n) {
        if (n == 0) return 1;  // Base case: x^0 = 1
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;  // If n is even, result is half^2
        } else {
            return half * half * x;  // If n is odd, result is half^2 * x
        }
    }
}
