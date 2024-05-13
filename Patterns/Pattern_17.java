/*

          A
        A B A
      A B C B A
    A B C D C B A

 */

import java.util.*;
public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();
        printpattern(n);

    }

    public static void printpattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=n-i-1; j++){
                System.out.print(" ");
            }
            for(char ch = 'A'; ch<='A'+i; ch++){
                System.out.print(ch);
            }
            for(char ch = (char)('A'+i-1); ch>='A'; ch--){
                System.out.print(ch);
            }
            for(int j=0; j<=n-i-1; j++){
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}