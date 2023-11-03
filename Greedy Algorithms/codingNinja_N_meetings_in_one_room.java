// Striver's SDE Sheet - Greedy Algorithms - Coding Ninja - N meetings in one room - Java

// There is one meeting room in a firm. There are N meetings in the form of (start[i], end[i]) where start[i] is start time of meeting i and end[i] is 
// finish time of meeting i. What is the maximum number of meetings that can be accommodated in the meeting room when only one meeting can be held in 
// the meeting room at a particular time?
// Note: Start time of one chosen meeting can't be equal to the end time of the other chosen meeting.
// Example 1:
// Input:
// start[] = {1,3,0,5,8,5}
// end[] =  {2,4,6,7,9,9}
// Output: 4
// Explanation: Maximum four meetings can be held with given start and end timings.
// The meetings are - (1, 2),(3, 4), (5,7) and (8,9)
// Constraints:
// 1 ≤ N ≤ 105
// 0 ≤ start[i] < end[i] ≤ 105



// Time: [O(n) +O(n log n) + O(n)] ~ O(n log n)
// Space: O(n)
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class codingNinja_N_meetings_in_one_room {
    public static class meeting{
        int start, end, pos;
        meeting(int start, int end, int pos){
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }

    public static class meetingcomparator implements Comparator<meeting>{
        @Override
        public int compare(meeting m1, meeting m2){
            if(m1.end < m2.end) return -1;
            else if(m1.end > m2.end) return 1;
            else if(m1.pos < m2.pos) return -1;
            return 1;
        }
    }

    public static int maximumMeetings(int []start, int []end) {
        ArrayList<meeting> meet = new ArrayList<>();

        for(int i=0; i<start.length; i++){
            meet.add(new meeting(start[i], end[i], i+1));
        }

        meetingcomparator mc = new meetingcomparator();
        Collections.sort(meet, mc);

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(meet.get(0).pos);
        int limit = meet.get(0).end;

        for(int i=1; i<start.length; i++){
            if(meet.get(i).start > limit){
                limit = meet.get(i).end;
                ans.add(meet.get(i).pos);
            }
        }

        return ans.size();
    }
}
