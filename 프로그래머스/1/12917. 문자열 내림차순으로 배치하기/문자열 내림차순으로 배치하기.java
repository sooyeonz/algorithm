import java.util.*;

class Solution {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        
        StringBuilder answer = new StringBuilder();
        for(int i = charArr.length - 1; i >= 0; i--){
            answer.append(charArr[i]);
        }
        
        return answer.toString();
    }
}