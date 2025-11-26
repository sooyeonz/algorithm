import java.util.*;

class Solution {
    public long solution(long n) {
        char[] ch = String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        
        StringBuilder sb = new StringBuilder(new String(ch)).reverse();
        
        return Long.parseLong(sb.toString());
    }
}