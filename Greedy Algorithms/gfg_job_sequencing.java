// Striver's SDE Sheet - Greedy Algorithms - GFG - Job Sequencing Problem - Java

// Given a set of N jobs where each jobi has a deadline and profit associated with it.
// Each job takes 1 unit of time to complete and only one job can be scheduled at a time. We earn the profit 
// associated with job if and only if the job is completed by its deadline.
// Find the number of jobs done and the maximum profit.
// Note: Jobs will be given in the form (Jobid, Deadline, Profit) associated with that Job.
// Example 1:
// Input: N = 4, Jobs = {(1,4,20),(2,1,10),(3,1,40),(4,1,30)}
// Output:
// 2 60
// Explanation: Job1 and Job3 can be done with maximum profit of 60 (20+40).
// Constraints:
// 1 <= N <= 105
// 1 <= Deadline <= N
// 1 <= Profit <= 500



// Time:O((n log n) + n*m)   [n = number of jobs, m = deadlines at worst case]
// Space:O(m)
import java.util.*;

class Job {
   int id, profit, deadline;
   Job(int x, int y, int z) {
      this.id = x;
      this.deadline = y;
      this.profit = z;
   }
}

public class gfg_job_sequencing {
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, (a,b) -> (b.profit - a.profit));
        
        int max = 0;
        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i].deadline);
        }
        
        int ans[] = new int[max];
        Arrays.fill(ans, -1);
        
        int cnt = 0, prft = 0;
        
        for(int i=0; i<n; i++){
            for(int j = arr[i].deadline-1; j>=0; j--){
                if(ans[j]==-1){
                    ans[j] = i;
                    cnt++;
                    prft += arr[i].profit;
                    break;
                }
            }
        }
        
        int[] res = new int[2];
        res[0] = cnt;
        res[1] = prft;
        
        return res;
    }
}
