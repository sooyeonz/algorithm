import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayDeque<Integer> answer = new ArrayDeque<>();
        int len = arr.length;
        
        answer.add(arr[0]);
        for(int i : arr){
            if(i != answer.peekLast()){
                answer.add(i);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}