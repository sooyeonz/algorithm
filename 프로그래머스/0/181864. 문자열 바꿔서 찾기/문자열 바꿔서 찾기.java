class Solution {
    public int solution(String myString, String pat) {
        char[] charArr = myString.toCharArray();
        
        String switchString = "";
        for(char c : charArr){
            if(c == 'A'){
                switchString += "B";
            } else if (c == 'B'){
                switchString += "A";
            }
        }
        
        if(switchString.contains(pat)){
            return 1;
        }
        
        return 0;
    }
}