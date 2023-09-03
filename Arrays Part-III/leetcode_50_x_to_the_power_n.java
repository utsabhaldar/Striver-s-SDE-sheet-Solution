// Striver's SDE Sheet - Array3 - Leetcode Q50 - Java

// 50. Pow(x, n)

// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

// Example 1:

// Input: x = 2.00000, n = 10
// Output: 1024.00000
// Example 2:

// Input: x = 2.10000, n = 3
// Output: 9.26100
// Example 3:

// Input: x = 2.00000, n = -2
// Output: 0.25000
// Explanation: 2-2 = 1/22 = 1/4 = 0.25

// Constraints:

// -100.0 < x < 100.0
// -231 <= n <= 231-1
// n is an integer.
// Either x is not zero or n > 0.
// -104 <= xn <= 104



// Optimal Approach
// Time:O(log n base 2)
// Space:O(1)
public class leetcode_50_x_to_the_power_n {
    public double myPow(double x, int n) {
        double ans = 1;
        long m = n;
        if(x==1) return 1;
        if(m<0) m *= (-1);
        while(m>0){
            if (m % 2 == 0) {
            x *= x;
            m /= 2;
        } else {
            ans *= x;
            m -= 1;
        }
        }
        if(n<0) ans = (double) (1.0) / (double) ans;
        return ans;
    }
}
