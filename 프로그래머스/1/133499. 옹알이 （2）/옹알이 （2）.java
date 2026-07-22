import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        HashMap<String, String> words = new HashMap<>();
        words.put("A", "aya");
        words.put("Y", "ye");
        words.put("W", "woo");
        words.put("M", "ma");
        
        for(String word : babbling){
            String temp = word;
            
            for(String key : words.keySet()){
                temp = temp.replace(words.get(key), key);
            }
            
            if(!temp.matches(".*(.)\\1.*") && temp.matches("[AYWM]*")){
                answer++;
            }
        }
        
        return answer;
    }
}