//Q3
package winsoft_assignment;

import java.util.HashMap;

public class Abc {
    public static void main(String[] args) {
        String str = "Betty bought a bit of butter, But the butter was so bitter, So she bought some better butter, To make the bitter butter better.";
        
        // Remove special characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the string into words
        String[] words = str.split("\\s+");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // Print the word counts
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
