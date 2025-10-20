class Solution {
    public String[] solution(String[] names) {
        int arrLength = 0;
        if(names.length % 5 == 0){
            arrLength = names.length / 5;
        } else {
            arrLength = names.length / 5 + 1;
        }
        
        String[] answer = new String[arrLength];
        
        int idx = 0;
        for(int i = 0; i < names.length; i += 5){
            answer[idx++] = names[i];
        }
        
        return answer;
    }
}