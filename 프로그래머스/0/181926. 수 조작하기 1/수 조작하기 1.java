class Solution {
    public int solution(int n, String control) {
        char[] str = control.toCharArray();     
        
        for(char s : str){
            if(s == 'w'){
                n += 1;
            } else if(s == 's'){
                n -= 1;
            } else if(s == 'd'){
                n += 10;
            } else if(s == 'a'){
                n -= 10;
            }
        }
        
        return n;
    }
}