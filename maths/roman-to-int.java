class RomanToInteger {
    public int romanToInt(String s) {
        int answer = 0, num = 0;

        for (int b = s.length() - 1; b >= 0; b--) {
            switch (s.charAt(b)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < answer) answer -= num;
            else answer += num;
        }

        return answer;
    }
}
