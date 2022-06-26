import java.util.*;
public class InputSum {
    public static void main(String args[]) {
        System.out.print("Enter the value of a : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        // Scanner sc2 = new Scanner(System.in);
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("Sum : ");
        System.out.println(sum);

        sc.close();
        // sc2.close();
    } 
}
