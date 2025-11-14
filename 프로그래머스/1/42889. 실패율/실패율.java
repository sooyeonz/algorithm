import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] challenger = new int[N + 2];
		Map<Integer, Double> rate = new HashMap<>();

		for (int i = 0; i < stages.length; i++) {
			challenger[stages[i]]++;
		}

		double people = stages.length;
		for (int i = 1; i <= N; i++) {
			if (challenger[i] == 0) {
				rate.put(i, 0.0);
			} else {
				rate.put(i, challenger[i] / people);
				people -= challenger[i];
			}
		}

		return rate.entrySet().stream()
			.sorted(Map.Entry.<Integer, Double>comparingByValue().reversed())
			.mapToInt(Map.Entry::getKey)
			.toArray();
    }
}