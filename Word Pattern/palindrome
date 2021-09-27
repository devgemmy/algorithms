const breakPalindrome = (palindrome) => {
    let long = palindrome.length;
    
    if (long == 1) {
        return "";
    }
        
    let palindromeArr = palindrome.split('');
    for (let i = 0; i < parseInt(long / 2); i++) {
        if (palindromeArr[i] != 'a') {
            palindromeArr[i] = 'a'
            return palindrome = new String(palindromeArr).replace(/,/g, "");
        }
    }
        
    palindromeArr[long - 1] = 'b';
    return palindrome = new String(palindromeArr).replace(/,/g, "");
};
