import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(answer.size() == 0){
                answer.add(arr[i]);
            } else {
                if(answer.get(answer.size() - 1).equals(arr[i])){
                    answer.remove(answer.size() - 1);
                } else {
                    answer.add(arr[i]);
                }
            }
        }
        
        if(answer.size() == 0){
            answer.add(-1);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}