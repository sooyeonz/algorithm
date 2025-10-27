import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);

        Set<Integer> set = new HashSet<>();
        int idx = 0;

        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                answer[idx++] = num;
                if (idx == k) break; 
            }
        }

        return answer;
    }
}