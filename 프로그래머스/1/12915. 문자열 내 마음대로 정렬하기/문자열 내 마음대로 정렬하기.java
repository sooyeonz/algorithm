import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        Map<Character, List<String>> wordMap = new HashMap<>();
        
        for(int i = 0; i < strings.length; i++){
            char key = strings[i].charAt(n);
            
            wordMap.putIfAbsent(key, new ArrayList<>());
            wordMap.get(key).add(strings[i]);
        }
        
        List<Character> sortedKeys = new ArrayList<>(wordMap.keySet());
        Collections.sort(sortedKeys);
        
        List<String> answer = new ArrayList<>();
        for(char key : sortedKeys){
            List<String> words = wordMap.get(key);
            Collections.sort(words);
            answer.addAll(words);
        }
        
        return answer.toArray(new String[0]);
    }
}