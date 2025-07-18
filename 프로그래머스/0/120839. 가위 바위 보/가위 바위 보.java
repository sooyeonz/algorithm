class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] rspArr = rsp.split("");
        
        for(String i : rspArr){
            if(i.equals("2")){
                answer += "0";
            } else if(i.equals("0")){
                answer += "5";
            } else if(i.equals("5")){
                answer += "2";
            }
        }
        
        return answer;
    }
}