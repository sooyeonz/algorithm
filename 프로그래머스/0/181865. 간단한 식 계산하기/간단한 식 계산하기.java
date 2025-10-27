class Solution {
    public int solution(String binomial) {
        String[] parts = binomial.split(" ");
        
        if(parts[1].equals("+")){
            return Integer.parseInt(parts[0]) + Integer.parseInt(parts[2]);
        } else if (parts[1].equals("-")){
            return Integer.parseInt(parts[0]) - Integer.parseInt(parts[2]);
        } else if (parts[1].equals("*")){
            return Integer.parseInt(parts[0]) * Integer.parseInt(parts[2]);
        }
        return -1;
    }
}