import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i : arr){
            answer.add(i);
        }
        
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){
                for(int j = answer.size() - 1; j > query[i]; j--){
                    answer.remove(j);
                }
            } else {
                for(int j = query[i] - 1; j >= 0; j--){
                    answer.remove(j);
                }
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}