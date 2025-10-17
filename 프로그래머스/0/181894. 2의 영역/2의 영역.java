class Solution {
    public int[] solution(int[] arr) {
        int firstIdx = -1;
        int lastIdx = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                if(firstIdx == -1){
                    firstIdx = i;
                }
                lastIdx = i; 
            }
        }
        
        if(firstIdx == -1){
            return new int[]{-1};
        }
        
        int[] answer = new int[lastIdx - firstIdx + 1];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr[firstIdx + i];
        }
        
        return answer;
    }
}