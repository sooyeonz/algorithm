
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
       Map<Character, Long> charCount = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        
        return charCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}