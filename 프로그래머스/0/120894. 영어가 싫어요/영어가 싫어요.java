class Solution {
    public long solution(String numbers) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String answer = numbers;
        
        for (int i = 0; i < words.length; i++) {
            answer = answer.replace(words[i], String.valueOf(i));
        }
        
        return Long.parseLong(answer);
    }
}