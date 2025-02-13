class Solution {
    public int mySqrt(int x) {
        // When x = 1 or 0
        if(x == 0 || x == 1) 
            return x;
        
        // Binary Search
        int start = 1;
        int end = x;
        int mid = -1; 

        while(start <= end) {
            // To avoid integer overflow
            mid = start + (end - start) / 2;

            if((long) mid * mid > (long) x) {
                // mid sqrt in lower search range half: move 'end' to the left
                end = mid - 1;
            } else if(mid * mid == x) {
                // mid sqrt = x, sqrt found!
                return mid;
            } else {
                // mid sqrt in higher search range half: move 'start to the right'
                start = mid + 1;
            }

        }

        // While loop ends if "start" > "end", and "end" = sqrt.
        // Round down "end" to the nearest int for the correct sqrt.
        return Math.round(end);
    }
}


// Time Complexity: The time complexity of this approach is O(logN). It's very efficient because Binary Search reduces the search range by half in each iteration, making the search faster.
// Space Complexity: The space complexity is O(1), which means the amount of extra memory used is constant, regardless of the input. We only use a few variables to store the search range and the middle value during the computation.
