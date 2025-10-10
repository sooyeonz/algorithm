class Solution {
    public String solution(String code) {
        String answer = "";
        
        char[] strArr = code.toCharArray();
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++){
            if(mode == 0){
                if(strArr[i] != '1' && i % 2 == 0){
                    answer += strArr[i];
                } else if(strArr[i] == '1'){
                    mode = 1;
                }
            } else if(mode == 1){
                if(strArr[i] != '1' && i % 2 != 0){
                    answer += strArr[i];
                } else if(strArr[i] == '1'){
                    mode = 0;
                }
            }
        }
 
        return answer.isEmpty() ? "EMPTY" : answer;
    }
}