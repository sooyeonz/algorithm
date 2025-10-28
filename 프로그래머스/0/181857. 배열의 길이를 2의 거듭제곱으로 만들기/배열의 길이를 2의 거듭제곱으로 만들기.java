import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int m = 1;

        while (m < n) {
            m *= 2;
        }

        int[] answer = new int[m];
        
        for (int i = 0; i < n; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}