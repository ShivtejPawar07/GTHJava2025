/*Check if Two Strings Are Anagrams (Using Sorting and Two Pointers)
Check if two strings are anagrams using sorting and comparing via two pointers*/
import java.util.*;

class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Step 1: if lengths differ, not anagrams
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        // Step 2: convert to char arrays and sort
        char[] arr1 = s1.toCharArray(); // ['l','i','s','t','e','n']
		char[] arr2 = s2.toCharArray(); // ['s','i','l','e','n','t']

		Arrays.sort(arr1); // ['e','i','l','n','s','t']
		Arrays.sort(arr2); // ['e','i','l','n','s','t']

        // Step 3: compare using two pointers
        int i = 0, j = 0;
        boolean isAnagram = true;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] != arr2[j]) {
                isAnagram = false;
                break;
            }
            i++;
            j++;
        }

        // Step 4: result
        if (isAnagram) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
