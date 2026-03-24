import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        Arrays.sort(d);
        
        int amount = 0, answer = 0, i = 0;
        while (i < d.length && amount + d[i] <= budget){
            amount += d[i];
            i++;
            answer++;
        }
        
        return answer;
    }
}