import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int button = sc.nextInt();

        switch (button) {
            case 1:
                //Addition
                int sum = a + b;
                System.out.println(sum);
                break;
            case 2:
                //Subtraction
                int diff = a - b;
                System.out.println(diff);
                break;
            case 3:
                //Multiplication
                int mul = a * b;
                System.out.println(mul);
                break;
            case 4:
                //Division
                int div = a / b;
                System.out.println(div);
                break;
            case 5:
                //Modulo
                int mod = a % b;
                System.out.println(mod);
                break;
        
            default:
                System.out.println("Invalid");
                break;
        }
        sc.close();
    }
}
