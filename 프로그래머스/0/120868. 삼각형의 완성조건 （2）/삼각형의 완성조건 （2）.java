import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        int sideSum = 0;
        for(int i: sides){
            sideSum += i;
        }
        
        answer += sides[0];
        answer += sideSum - sides[1] - 1;
        
        return answer;
    }
}