import java.util.*;

class Solution {
    public int solution(int n) {
        
        ArrayList<Integer> trit = new ArrayList<>();
        
        while (n > 0) {
            trit.add(n % 3);
            n /= 3;
        }
        
        int answer = 0;
        int len = trit.size();
        
        for(int i = 0; i < len; i++){
            int value = trit.get(i);
            answer += value * (int)Math.pow(3, len - 1 - i);
        }
        
        return answer;
    }
}