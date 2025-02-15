class Solution {
    public int punishmentNumber(int n) {
        // Store the punishment number
        int punishNum = 0;

        // Traverse the array
        for (int cur = 1; cur <= n; cur++) {
            // finding the square
            int sqr = cur * cur;

            if (canPartition(sqr, cur))
                punishNum += sqr;
        }

        return punishNum;
    }

    public boolean canPartition(int num, int target) {
        if(num < target || target < 0)
            return false;

        if(num == target)
            return true;

        return (
            canPartition(num/10, target-(num % 10)) || 
            canPartition(num/100, target-(num % 100)) || 
            canPartition(num/1000, target-(num % 1000))
        );
    }
}

// Time complexity:O(N*log(S))
// Space complexity: O(log(S))
