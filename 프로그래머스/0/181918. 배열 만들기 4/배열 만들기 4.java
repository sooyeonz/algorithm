import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(stk.size() == 0){
                stk.add(arr[i]);
                continue;
            }
            
            int lastIndex = stk.size() - 1;
            if(stk.get(lastIndex) < arr[i]){
                stk.add(arr[i]);
                continue;
            } else{
                stk.remove(lastIndex);
                i--;
            }
        }
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}