import java.util.*; 

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> numList = new ArrayList<>();
        
        for(int i = start_num; i <= end_num; i++){
            numList.add(i);
        }
        
        return numList.stream().mapToInt(Integer::intValue).toArray();
    }
}