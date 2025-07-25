class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        
        String[] aeiou = {"a","e","i","o","u"};
        
        for (String v : aeiou) {
            answer = answer.replaceAll(v, "");
        }
        
        return answer;
    }
}