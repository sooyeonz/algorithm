import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (String s : strArr) {
            int len = s.length();
            map.put(len, map.getOrDefault(len, 0) + 1);
        }
        
        int maxCount = 0;
        for (int count : map.values()) {
            maxCount = Math.max(maxCount, count);
        }
        
        return maxCount;
    }
}