package longestPalindrome;

import java.util.Arrays;

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
