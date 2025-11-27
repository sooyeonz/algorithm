class Solution {
    public boolean solution(int x) {
        char[] ch = String.valueOf(x).toCharArray();
        
        int n = 0;
        for(char c : ch){
            n += c - '0';
        }
        
        return x % n == 0 ? true : false;
    }
}