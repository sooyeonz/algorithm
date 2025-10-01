class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = String.valueOf(k);
        
        for(int num = i; num <= j; num++) {
            String strNum = String.valueOf(num);
            
            for(char c : strNum.toCharArray()) {
                if(c == strK.charAt(0)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}