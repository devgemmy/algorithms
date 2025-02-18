class DIString {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        StringBuilder result = new StringBuilder();
        int[] stack = new int[n + 1]; 
        int index = 0;

        for (int i = 0; i <= n; i++) {
            stack[index++] = i + 1;

            if (i == n || pattern.charAt(i) == 'I') {
                while (index > 0) {
                    result.append(stack[--index]);
                }
            }
        }

        return result.toString();
    }
}

// Time Complexity: O(n) — We iterate through the string once and manage the stack in constant time.
// Space Complexity: O(n) — The space used by the stack and result string is proportional to the input size.
