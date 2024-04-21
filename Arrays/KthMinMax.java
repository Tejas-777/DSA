// Find Kth max and min element ina an array

import java.util.*;
public class KthMinMax {
    public static void main(String[] args) {
        int[] arr = {7, 5, 1, 3, 2, 4, 6};
        int k = 3;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        System.out.println(arr[arr.length-k]);
    }

}
