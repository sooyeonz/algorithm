class Solution {
    public String solution(String str1, String str2) {
        int length = str1.length() + str2.length();
        char[] answer = new char[length];
        
        int count1 = 0;
        for(int i = 0; i < length; i+=2){
            answer[i] = str1.charAt(count1);
            count1++;
        }
        
        int count2 = 0;
        for(int i = 1; i < length; i+=2){
            int count = 0;
            answer[i] = str2.charAt(count2);
            count2++;
        }
        
        
        return String.valueOf(answer);
    }
}