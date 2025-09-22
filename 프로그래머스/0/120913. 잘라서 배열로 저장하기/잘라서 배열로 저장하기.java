class Solution {
    public String[] solution(String my_str, int n) {
        int len = (my_str.length() + n - 1) / n; 
        
        String[] answer = new String[len];
        
        int index = 0;
        for(int i = 0; i < my_str.length(); i += n){
            int endIndex = Math.min(i + n, my_str.length());
            answer[index] = my_str.substring(i, endIndex);
            index++;
        }        
        
        return answer;
    }
}