const maxTurbulenceSize = (arr) => {
    
    // get the array length
    let subArr = Array(arr.length).fill(0);
    subArr[0] = 1; // the 1st value starts the 1st turbulent subarray
    
    if (arr.length == 1) { 
        return 1 
    } else if (arr.length == 2 && arr[0] != arr[1]) {
        subArr[1] = subArr[0] + 1
        return subArr[1]
    }
    
}
