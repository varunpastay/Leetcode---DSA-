import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();

        paragraph = paragraph.replaceAll("[!?',;.]", " ");

        String[] words = paragraph.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {

            if (word.length() == 0) {
                continue;
            }

            boolean isBanned = false;

            for (String b : banned) {
                if (word.equals(b)) {
                    isBanned = true;
                    break;
                }
            }

            if (!isBanned) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        String answer = "";
        int max = 0;

        for (String word : map.keySet()) {

            if (map.get(word) > max) {
                max = map.get(word);
                answer = word;
            }
        }

        return answer;
    }
}