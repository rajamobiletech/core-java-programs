package org.example;


import java.util.Arrays;
import java.util.Collections;

class Sample {
    // Basic initialization
    int[] intArray = new int[20];
//    int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

    //Two dimensional array:
    int[][] twoD_arr = new int[10][10];

    String arrName = "er";
    // fill the array
    Arrays.fill(arrName, 10);


    // Sort
    Arrays.sort(arr);
    Arrays.sort(arr, Collections.reverseOrder());

    // reverse the array
    Collections.reverse(Arrays.asList(a));
    // reverse array using string builder
    String[] arr = {"Hello", "World"};
    StringBuilder reversed = new StringBuilder();
    for(int i = arr.length; i > 0; i--) {
            reversed.append(arr[i - 1]).append(" ");
        };
    String[] reversedArray = reversed.toString().split(" ");


}
