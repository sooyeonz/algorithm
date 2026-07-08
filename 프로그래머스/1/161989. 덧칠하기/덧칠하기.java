import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        
        ArrayList<Integer> wall = new ArrayList<>();
        for(int i : section){
            wall.add(i);
        }

        int answer = 0;
        while(!wall.isEmpty()){
            
            int fill = wall.get(0) + m;
            wall.removeIf(v -> v < fill);
            answer++;
        }
        
        return answer;
    }
}