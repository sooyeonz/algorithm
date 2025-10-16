class Solution {
    public int[] solution(int start_num, int end_num) {
        int numLength = start_num - end_num;
        int[] answer = new int[numLength + 1];
        
        for(int i = 0; i <= numLength; i++){
            answer[i] = start_num;
            start_num--;
        }
        
        return answer;
    }
}