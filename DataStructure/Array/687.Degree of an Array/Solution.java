import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            if (left.get(x) == null) {
                left.put(x, i);  // ✅ lowercase i
            }

            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);  // ✅ capital D
        }

        int ans = n;
        int degree = Collections.max(count.values());

        for (int x : count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }

        return ans;
    }
}
