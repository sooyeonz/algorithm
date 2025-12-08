class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        
        for(char c : s.toCharArray()){
            if (Character.toLowerCase(c) == 'p') {
                p++;
            } else if(Character.toLowerCase(c) == 'y'){
                y++;
            }
        }      

        return p == y ? true : false;
    }
}