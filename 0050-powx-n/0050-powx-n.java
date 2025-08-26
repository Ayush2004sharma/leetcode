class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;

        long exp = n; // use long to handle Integer.MIN_VALUE case
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        double result = 1.0;
        while (exp > 0) {
            if ((exp & 1) == 1) { // if odd
                result *= x;
            }
            x *= x;  // square base
            exp >>= 1; // divide exponent by 2
        }
        return result;
    }
}
