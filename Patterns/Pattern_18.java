/*

 E
 D E
 C D E
 B C D E
 A B C D E

 */

import java.util.*;
public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();
        printpattern(n);

    }

    public static void printpattern(int n){
        for(int i=0; i<n; i++) {
            for(char ch = (char)('A'+n-i-1); ch <='A'+n-1; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}