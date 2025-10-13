class Solution {
    public String solution(String my_string, int[] index_list) {
        char[] stringChar = my_string.toCharArray();
        String answer = "";
        
        for(int i : index_list){
            answer += stringChar[i];
        }
        
        return answer;
    }
}