import java.util.Arrays;

// For String
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

// For Integer
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
           return false;

        int z = x;
        int rev = 0;
        while (x > 0){
            int lst = x % 10;
            rev = rev * 10 + lst;
            x = x / 10;
        }

        if(rev == z){
            return true;
        } else{
            return false;
        }
    }
}

