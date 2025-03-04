class Solution {
   private int[] res;

    public int[] constructDistancedSequence(int n) {
        res = null;
        int[] result = new int[2 * n - 1];
        boolean[] used = new boolean[n + 1];
        backtrack(result, used, n, 0);
        return result;
    }

    private boolean backtrack(int[] result, boolean[] used, int n, int index) {
        if (index == result.length) {
            res = result.clone();
            return true;
        }

        // while(index < result.length && result[index] != 0)
        //     index++;

        if (result[index] != 0) return backtrack(result, used, n, index + 1); // Skip occupied
        
        for (int i = n; i >= 1; i--) {
            if (used[i]) continue;

            int trace = (i == 1) ? index : index + i;
            if (trace < result.length && result[trace] == 0) {
                result[index] = i;
                result[trace] = i;
                used[i] = true;

                if (backtrack (result, used, n, index + 1)) return true;

                result[index] = 0;
                result[trace] = 0;
                used[i] = false;
            }

            // if (i == 1) {
            //     result[index] = 1;
            //     used[1] = true;
            //     if(backtrack(result, used, n, index + 1)) return true;
            //     result[index] = 0;
            //     used[1] = false;
            // } else {
            //     if (index + i < result.length && result[index + i] == 0) {
            //         result[index] = i;
            //         result[index + i] = i;
            //         used[i] = true;
            //         if(backtrack(result, used, n, index + 1)) return true;
            //         result[index] = 0;
            //         result[index + 1] = 0;
            //         used[i] = false;
            //     }
            // }
        }

        return false;
    }
}

// Time Complexity: O(n!) due to backtracking.
// Space Complexity: O(n) for the result and used arrays.
