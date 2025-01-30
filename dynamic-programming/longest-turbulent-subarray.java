import java.util.Array;

public class Main {
  public static int maxTurbulenceSize(int[] arr) {
    // get the array length and duplicate the length
    int[] subArr = new int[arr.length];
    subArr[0] = 1; // the 1st value starts the 1st turbulent subarray

    if (arr.length == 1) {
        // if the arr has only 1 item
        return 1;

    } else if (arr.length == 2 && arr[0] != arr[1]) {
        // if the arr has only 2 unidentical items
        subArr[1] = subArr[0] + 1;
        return subArr[1];

    } else if (arr.length == 2 && arr[0] == arr[1]) {
        // if the arr has only 2 identical items
        subArr[1] += subArr[0];
        return subArr[1];
    }

    // add turbulent item to current subarray
    for (int i = 1; i < arr.length - 1; i++) {
        // if the arr has more than 2
        if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
            subArr[i] = subArr[i - 1] + 1;

        } else if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
            subArr[i] = subArr[i - 1] + 1;

        } else if (arr[i] == arr[i - 1] && arr[i] == arr[i + 1]) {
            subArr[i] = 0;

        } else {
            subArr[i] = 1;
        }
    }

    // return length of longest subarr
    int maxArr = 0;
    for (int j = 0; j < subArr.length; j++) {
        if (maxArr < subArr[j]) {
            maxArr = subArr[j];
        }
    }

    if (Arrays.stream(arr).allMatch(val -> val == arr[0])) {
        return maxArr;
    } else {
        return maxArr + 1;
    }
  }
}
