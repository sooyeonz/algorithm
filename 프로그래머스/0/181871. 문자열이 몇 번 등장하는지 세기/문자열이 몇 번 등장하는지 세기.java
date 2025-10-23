class Solution {
    public int solution(String myString, String pat) {
        int idx = myString.indexOf(pat);
        int count = 0;

        while (idx != -1) {
            count++;
            idx = myString.indexOf(pat, idx + 1); 
        }

        return count;
    }
}