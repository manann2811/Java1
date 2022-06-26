//Pascal's Triangle --> Not complete ***

import java.util.*;
public class Pattern17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("1 ");
                }
                else if(j==2 || j==i-1){
                    System.out.print(i-1 + " ");
                }
                else{
                int res = ((i-2)*(i-1))/((j-2)*(j-1));
                    System.out.print(res + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
