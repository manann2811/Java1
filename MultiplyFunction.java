import java.util.*;
public class MultiplyFunction {
    public static int calculateProduct(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = calculateProduct(a, b);
        System.out.println("Multiplication of 2 numbers = " + product);
        sc.close();
    }
}