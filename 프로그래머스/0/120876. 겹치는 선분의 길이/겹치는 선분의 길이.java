import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        List<int[]> overlaps = new ArrayList<>();

        for (int i = 0; i < lines.length; i++) {
            for (int j = i + 1; j < lines.length; j++) {
                int[] overlap = getOverlap(lines[i], lines[j]);
                if (overlap != null) {
                    overlaps.add(overlap);
                }
            }
        }

        if (overlaps.isEmpty()) return 0;

        return getTotalLength(overlaps);
    }
    
    private int[] getOverlap(int[] line1, int[] line2) {
        int overlapStart = Math.max(line1[0], line2[0]);

        int overlapEnd = Math.min(line1[1], line2[1]);

        return overlapStart < overlapEnd ? new int[]{overlapStart, overlapEnd} : null;
    }

    private int getTotalLength(List<int[]> overlaps) {
        overlaps.sort((a, b) -> a[0] - b[0]);
        
        List<int[]> merged = new ArrayList<>();
        merged.add(overlaps.get(0));
        
        for (int i = 1; i < overlaps.size(); i++) {
            int[] current = overlaps.get(i);
            int[] last = merged.get(merged.size() - 1);

            if (current[0] <= last[1]) {
                last[1] = Math.max(last[1], current[1]);
            } else {
                merged.add(current);
            }
        }

        int totalLength = 0;
        for (int[] segment : merged) {
            totalLength += segment[1] - segment[0];
        }
        
        return totalLength;
    }
}