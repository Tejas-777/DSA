import java.util.*;

public class largest_element_in_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int ans = largest(arr,n);
        System.out.println("Largest element in array is : "+ ans);
    }
    /* Approach 1 :
        Sort the arrays with arrays.sort() method
        which internally implements merge sort
        return last element

        Time Complexity : O(nlogn)
 */

    private static int largest(int[] arr, int n) {

        Arrays.sort(arr);
        return arr[n-1];
    }

    /* Approach 2 :
        Take first index as largest
        Compare it with each element in array
        if larger element found replace it
        return largest element

        Time Complexity : O(n)
 */


//    private static int largest(int[] arr, int n) {
//        int largest = arr[0];
//        for(int i=0; i<arr.length; i++){
//            if(largest<arr[i]){
//                largest = arr[i];
//            }
//        }
//        return largest;
//    }




}
