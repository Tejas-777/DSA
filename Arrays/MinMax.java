// Find minimum and maximum number in an array

import java.util.*;
public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[] arr){
        int minValue = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }

    static int max(int[] arr){
        int maxValue = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
