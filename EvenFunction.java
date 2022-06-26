import java.util.*;
public class EvenFunction {
    public static void checkEven(int n){
        if(n%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkEven(n);
        sc.close();
    }
}
