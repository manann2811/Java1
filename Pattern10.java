//Solid Rhombus

import java.util.*;
public class Pattern10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=(2*n)-i; j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }    
}
