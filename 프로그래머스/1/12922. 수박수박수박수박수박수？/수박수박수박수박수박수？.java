class Solution {
    public String solution(int n) {
        String su = "수";
        String bark = "박";
        
        StringBuilder answer = new StringBuilder();
        
        int index = 0;
        while(index < n){
            if(index % 2 == 0){
                answer.append(su);
            } else {
                answer.append(bark);
            }
            index++;
        }        
        
        return answer.toString();
    }
}