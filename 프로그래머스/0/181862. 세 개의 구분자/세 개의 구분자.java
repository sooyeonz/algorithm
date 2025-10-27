import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] temp = myStr.split("a|b|c");
        
        List<String> list = new ArrayList<>();
        for(String s : temp){
            if(!s.isEmpty()){
                list.add(s);
            }
        }
        
        if(list.isEmpty()){
            list.add("EMPTY");
        }
        
        return list.toArray(new String[0]);
    }
}