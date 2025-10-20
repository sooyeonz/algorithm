class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int falseCount = 0;
        for(boolean b : finished){
            if(b == false){
                falseCount++;
            }
        }
        
        String[] answer = new String[falseCount];
        int idx = 0;
        for(int i = 0; i < finished.length; i++){
            if(finished[i] == false){
                answer[idx++] = todo_list[i]; 
            }
        }
        
        return answer;
    }
}