class Solution {
    public String solution(String phone_number) {
        char[] phoneChar = phone_number.toCharArray();
        for(int i = 0; i < phoneChar.length - 4; i++){
            phoneChar[i] = '*';
        }
        
        return new String(phoneChar);
    }
}