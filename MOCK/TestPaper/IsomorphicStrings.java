/*13) Isomorphic Strings 
Two strings are isomorphic if characters map one-to-one. 
Example 
Input: "egg", "add" → true 
Input: "foo", "bar" → false*/

import java.util.*;

class IsomorphicStrings {
    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Check s -> t mapping
            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2) {
                    System.out.println(false);
                    return;
                }
            } else {
                map1.put(c1, c2);
            }

            // Check t -> s mapping
            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1) {
                    System.out.println(false);
                    return;
                }
            } else {
                map2.put(c2, c1);
            }
        }

        System.out.println(true);
    }
}
