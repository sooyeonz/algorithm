class Solution {
    public int[] solution(int[] num_list) {
        int listLength = num_list.length;
        int[] answer = new int[listLength + 1];
        
        for(int i = 0; i < listLength; i++) {
            answer[i] = num_list[i];
        }
        
        int lastElement = num_list[listLength - 1];
        int beforeLastElement = num_list[listLength - 2];
        
        if(lastElement > beforeLastElement){
            answer[listLength] = lastElement - beforeLastElement;
        } else {
            answer[listLength] = lastElement * 2;
        }
        
        return answer;
    }
}