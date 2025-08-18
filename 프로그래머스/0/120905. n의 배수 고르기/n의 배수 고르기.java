import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
       List<Integer> list = new ArrayList<>();
        
        for(int s : numlist){
            if (s % n == 0){
                list.add(s); 
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}