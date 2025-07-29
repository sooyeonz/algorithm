import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int minDistance = Math.abs(n - array[0]);
        
        for(int i = 1; i < array.length; i++){
            int currentDistance = Math.abs(n - array[i]);
            
            if (currentDistance < minDistance || 
                (currentDistance == minDistance && array[i] < answer)) {
                minDistance = currentDistance;
                answer = array[i];
            }
        }
        
        return answer;
    }
}