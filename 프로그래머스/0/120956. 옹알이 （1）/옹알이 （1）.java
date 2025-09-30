class Solution {
    public int solution(String[] babbling) {
        String[] validWords = {"aya", "ye", "woo", "ma"};
        int count = 0;
        
        for (String word : babbling) {
            String temp = word;
   
            for (String valid : validWords) {
                temp = temp.replace(valid, "_");
            }
            
            temp = temp.replace("_", "");
            
            if (temp.isEmpty()) {
                count++;
            }
        }
        
        return count;
    }
}