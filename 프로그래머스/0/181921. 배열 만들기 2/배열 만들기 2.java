import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> zeroFive = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            String stringI = Integer.toString(i);
            boolean isValid = true;
            
            for(char c: stringI.toCharArray()){
                if(c != '0' && c != '5'){
                    isValid = false;
                    break;
                }
            }
            
            if(isValid){
                    zeroFive.add(i);
            }
        }
        
        if(zeroFive.size() == 0){
            zeroFive.add(-1);
        }
        
        return zeroFive.stream().mapToInt(Integer::intValue).toArray();
    }
}

            
