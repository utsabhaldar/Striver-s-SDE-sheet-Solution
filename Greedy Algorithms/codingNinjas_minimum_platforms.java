// Striver's SDE Sheet - Greedy Algorithms - Coding Ninja - Minimum Platforms - Java

// Given arrival and departure times of all trains that reach a railway station. Find the minimum number of platforms required for the railway station so that no train is kept waiting.
// Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure time can never be the same for a train but we can have arrival time of one train equal to departure time of the other. At any given instance of time, same platform can not be used for both 
// departure of a train and arrival of another train. In such cases, we need different platforms.
// Example 1:
// Input: n = 6 
// arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
// dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
// Output: 3
// Explanation: 
// Minimum 3 platforms are required to safely arrive and depart all trains.
// Note: Time intervals are in the 24-hour format(HHMM) , where the first two characters represent hour (between 00 to 23 ) 
// and the last two characters represent minutes (this may be > 59).
// Constraints:
// 1 ≤ n ≤ 50000
// 0000 ≤ A[i] ≤ D[i] ≤ 2359



// Time:O(2n log n + 2n)
// Space:O(1)
import java.util.Arrays;

public class codingNinjas_minimum_platforms {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        Arrays.sort(at);
        Arrays.sort(dt);

        int cnt = 1, max = 1;
        int i=1, j=0;

        while(i<n && j<n){
            if(at[i] <= dt[j]){
                cnt++;
                i++;
            }
            else{
                cnt--;
                j++;
            }

            max = Math.max(cnt, max);
        }

        return max;
    }
}
