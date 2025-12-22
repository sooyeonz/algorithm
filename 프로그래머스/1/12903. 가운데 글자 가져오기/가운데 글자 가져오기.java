class Solution {
    public String solution(String s) {
        int len = s.length();

        if (len % 2 == 0) {
            StringBuilder answer = new StringBuilder();
            answer.append(s.charAt(len / 2 - 1));
            answer.append(s.charAt(len / 2));
            return answer.toString();
        } else {
            return String.valueOf(s.charAt(len / 2));
        }
    }
}