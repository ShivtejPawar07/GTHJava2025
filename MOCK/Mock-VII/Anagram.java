/*Q8. tore N words in a HashMap. Group all anagrams together without using sort(). 
Input: 6 
listen , silent , cat , act , dog , god 
Output: 
Anagram Groups: 
listen silent 
cat act 
dog god 
Description: 
Store the given words in a HashMap. 
 
Do not use: 
• Arrays.sort() 
• Collections.sort() 
• Any built-in anagram checking methods 
Finally, traverse the Map and print groups containing more than one word. */

import java.util.*;

class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of words:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        HashMap<String, List<String>> map = new HashMap<>();

        System.out.println("Enter " + n + " words:");
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            String key = getSignature(word); // generate signature without sorting

            // Add word to map
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        System.out.println("\nAnagram Groups:");
        for (List<String> group : map.values()) {
            if (group.size() > 1) { // only groups with more than one word
                for (String w : group) {
                    System.out.print(w + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }

    // Generate a signature based on character counts
    static String getSignature(String word) {
        int[] count = new int[26]; // assuming lowercase a-z
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }

        // Convert count array to a string as key
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(count[i]).append("#"); // separator to avoid ambiguity
        }
        return sb.toString();
    }
}