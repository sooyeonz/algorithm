import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
		HashMap<String, HashMap<Integer, Integer>> genreMap = new HashMap<>();

		for (int i = 0; i < genres.length; i++) {
			String genre = genres[i];
			int play = plays[i];

			if (!genreMap.containsKey(genre)) {
				genreMap.put(genre, new HashMap<>());
			}

			genreMap.get(genre).put(i, play);
		}

		HashMap<String, Integer> genreTotalPlays = new HashMap<>();

		for (String genre : genreMap.keySet()) {
			int total = 0;
			for (int play : genreMap.get(genre).values()) {
				total += play;
			}
			genreTotalPlays.put(genre, total);
		}

		List<String> sortedGenres = new ArrayList<>(genreTotalPlays.keySet());
		sortedGenres.sort((a, b) -> genreTotalPlays.get(b) - genreTotalPlays.get(a));

		List<Integer> result = new ArrayList<>();

		for (String genre : sortedGenres) {
			HashMap<Integer, Integer> songsInGenre = genreMap.get(genre);

			List<Map.Entry<Integer, Integer>> songList = new ArrayList<>(songsInGenre.entrySet());

			songList.sort((a, b) -> {
				if (b.getValue().equals(a.getValue())) {
					return a.getKey() - b.getKey();
				}
				return b.getValue() - a.getValue();
			});

			for (int i = 0; i < Math.min(2, songList.size()); i++) {
				result.add(songList.get(i).getKey());
			}
		}

		return result.stream().mapToInt(i -> i).toArray();
    }
}