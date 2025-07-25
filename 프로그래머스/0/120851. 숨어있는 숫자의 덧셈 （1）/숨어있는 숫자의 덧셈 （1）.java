class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] string = my_string.replaceAll("[a-zA-Z]","").split("");
        
        for(String i : string) {
            answer += Integer.parseInt(i);
        }
        
        return answer;
    }
}