import java.util.Arrays;

public class Main {
    public static String breakPalindrome(String palindrome) {
        int longLength = palindrome.length();
        
        if (longLength == 1) {
            return "";
        }
        
        char[] palindromeArr = palindrome.toCharArray();
        for (int i = 0; i < longLength / 2; i++) {
            if (palindromeArr[i] != 'a') {
                palindromeArr[i] = 'a';
                return new String(palindromeArr);
            }
        }
        
        palindromeArr[longLength - 1] = 'b';
        return new String(palindromeArr);
    }
}

