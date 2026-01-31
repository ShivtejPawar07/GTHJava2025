/*2. Group Anagrams (LC 49)
Description:
 Group strings that are anagrams of each other.
Example:
 Input: ["eat","tea","tan","ate","nat","bat"]
 Output: [["eat","tea","ate"], ["tan","nat"], ["bat"]]
Approach (HashMap + ArrayList):
Sort characters of each word to create a key
Map key → list of words
Return map values
*/

import java.util.*;

class Anagrams {
    public static void main(String[] x) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String word : strs) {
            // convert word to char array
            char[] ch = word.toCharArray();

            // sort characters
            Arrays.sort(ch);

            // create key
            String key = new String(ch);

            // if key not present, add new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // add word to list
            map.get(key).add(word);
        }

        // print result
        System.out.println(map.values());
    }
}
