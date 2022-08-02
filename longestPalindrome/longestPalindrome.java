package longestPalindrome;

import java.util.Arrays;


//409. Longest Palindrome
// Given a string s which consists of lowercase or uppercase letters, 
//return the length of the longest palindrome that can be built with those letters.
// Letters are case sensitive, for example, "Aa" is not considered a palindrome here

public class longestPalindrome {

    public static void main(String[] args){
        System.out.println(longestPalindrome("kahdfkajsfh"));
    }

    public static int longestPalindrome(String s){
		int[] countAbc = new int['z' - 'A' + 1];
        System.out.println(Arrays.toString(countAbc));
		for (char c : s.toCharArray()) countAbc[c - 'A']++;
		int odd = 0;
		for (char c = 'A'; c <= 'z'; c++) odd += (countAbc[c - 'A'] & 1);

		return s.length() - odd + (odd > 0 ? 1 : 0);
	}
    
}
