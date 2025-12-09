import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < 10; i++){
            numMap.put(i,0);
        }
        
        for(int i : numbers){
            numMap.put(i, 1);
        }
        
        int answer = 0;
        for(int key : numMap.keySet()){
            if(numMap.get(key) == 0){
                answer += key;
            }
        }
        
        return answer;
    }
}