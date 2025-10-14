import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        List<String> suffix = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            suffix.add(my_string.substring(i, my_string.length()));
        }
        
        for(String str : suffix){
            if(str.equals(is_suffix)){
                return 1;
            } 
        }
        
        return 0;
    }
}