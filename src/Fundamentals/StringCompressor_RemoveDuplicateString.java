package Fundamentals;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringCompressor_RemoveDuplicateString {

	public static void main(String[] args) {
//		StringCompressor_MainLogic
		String input = "aabbbcccc";
		String compressed = compress(input);
		System.out.println("Original: " + input);
		System.out.println("After Compressed: " + compressed);
		
		System.out.println("--------------------------");
		
//		RemoveDuplicate_MainLogic
        String RemoveDuplicateinput = "programming";
        String result = removeDuplicates(RemoveDuplicateinput);
        System.out.println("Original String: " + RemoveDuplicateinput);
        System.out.println("After Removing Duplicates: " + result);
	}

	public static String compress(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}

		StringBuilder compressed = new StringBuilder();
		int count = 1;

		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == input.charAt(i - 1)) {
				count++;
			} else {
				compressed.append(input.charAt(i - 1)).append(count);
				count = 1;
			}
		}

		// Add the last character and count
		compressed.append(input.charAt(input.length() - 1)).append(count);

		return compressed.toString();
	}
	
	public static String removeDuplicates(String str) {
        // LinkedHashSet maintains insertion order
        Set<Character> charSet = new LinkedHashSet<>();
        
        for (char ch : str.toCharArray()) {
            charSet.add(ch); // duplicates are ignored automatically
        }
        
        // Build result from Set
        StringBuilder sb = new StringBuilder();
        for (char ch : charSet) {
            sb.append(ch);
        }
        
        return sb.toString();
    }

}
