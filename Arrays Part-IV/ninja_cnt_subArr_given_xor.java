// Striver's SDE Sheet - Array4 - Coding Ninja - Java

// Count Subarrays with Given XOR


// Time:O(n*log n)
// Space:O(n)
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ninja_cnt_subArr_given_xor {
    public static int subarraysXor(ArrayList<Integer> arr, int k) {
		int n=arr.size();
		int xr=0;
		Map<Integer, Integer> mp = new HashMap<>();
		mp.put(xr, 1);
		int cnt = 0;

		for(int i=0; i<n; i++){
			xr ^= arr.get(i);
			int x = xr^k;
			if(mp.containsKey(x)) cnt += mp.get(x);			
			if(mp.containsKey(xr)) mp.put(xr, mp.get(xr)+1);
			else mp.put(xr, 1);
		}
		return cnt;
	}
}
