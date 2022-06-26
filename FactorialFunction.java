import java.util.*;
public class FactorialFunction {
    public static void calculateFactorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calculateFactorial(n);
        sc.close();
    }
}
