class Solution {
    public int solution(int num, int k) {
        String str = Integer.toString(num);
        char target = Integer.toString(k).charAt(0);
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return i + 1;
            }
        }
        
        return -1;
    }
}