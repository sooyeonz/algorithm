class Solution {
    public String solution(String s, int n) {
        
        char[] ch = s.toCharArray();
        StringBuilder answer = new StringBuilder();
        
        for(char c : ch){
            if(c == ' '){
                answer.append(c);
            } else if(Character.isUpperCase(c)){
                answer.append((char) ((c - 'A' + n) % 26 + 'A'));
            } else {
                answer.append((char) ((c - 'a' + n) % 26 + 'a'));
            }
        }
    
        return answer.toString();
    }
}