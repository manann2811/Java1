//Number Pyramid

import java.util.*;
public class Pattern11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+i-1; j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else{
                    int sum=i+j;
                    if(sum%2==0){
                        System.out.print(i);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}


// ----1
// ---2-2
// --3-3-3
// -4-4-4-4
// 5-5-5-5-5
