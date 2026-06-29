import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        int len = photo.length;
        int[] answer = new int[len];
        
        Map<String, Integer> scoreMap = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            scoreMap.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i < len; i++){
            for(int j = 0; j < photo[i].length; j++){
                if (scoreMap.get(photo[i][j]) == null){
                    continue;
                }
                answer[i] += scoreMap.get(photo[i][j]);
            }
        }
        
        return answer;
    }
}