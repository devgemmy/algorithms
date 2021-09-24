const spiralOrder = (matrix) => {
    // count the number of subarrays
    let ml = matrix.length,
        n = 0;
    
    // check the length of each
    for (let i = 0; i < ml; i++) {
        n = matrix[i].length;
    }
    
    let matx = ml * n,
        newMatrix = Array(matx).fill(0);
    
    if (ml >= 3) {
        /* push the first row: matrix[0] */
    
        /* push the last column of middle items: 
        matrix[1][n-1] to matrix[ml-2][n-1] */

        /* push the last row backwards: 
        */
        
        /* push the first column of the middle items backwards: 
        */
        
        /* push the second row of the middle items: */

        // return newMatrix;
    }
    
    // return newMatrix;
};
