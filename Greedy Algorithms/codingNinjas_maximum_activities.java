// Striver's SDE Sheet - Greedy Algorithms - Coding Ninja - Maximum Activities - Java

// Same as N meetings in 1 room

// Time: [O(n) +O(n log n) + O(n)] ~ O(n log n)
// Space: O(n)

import java.util.*;

public class codingNinjas_maximum_activities {
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

    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        ArrayList<meeting> meet = new ArrayList<>();

        for(int i=0; i<start.size(); i++){
            meet.add(new meeting(start.get(i), end.get(i), i+1));
        }

        meetingcomparator mc = new meetingcomparator();
        Collections.sort(meet, mc);

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(meet.get(0).pos);
        int limit = meet.get(0).end;

        for(int i=1; i<start.size(); i++){
            if(meet.get(i).start >= limit){
                limit = meet.get(i).end;
                ans.add(meet.get(i).pos);
            }
        }

        return ans.size();
    }
}
