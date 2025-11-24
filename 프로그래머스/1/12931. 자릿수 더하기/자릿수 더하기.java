import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        char[] ch = String.valueOf(n).toCharArray();
        
        for(char c : ch){
            int i = c - '0';
            answer += i;
        }

        return answer;
    }
}