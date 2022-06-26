import java.util.*;
public class MenuDriven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 0:
                break;
        
            case 1:
                System.out.print("Enter the marks : ");
                int x = sc.nextInt();
                if(x>=90){
                    System.out.println("This is Good");
                }
                else if(x<=89 && x>=60){
                    System.out.println("This is also Good");
                }
                else{
                    System.out.println("This is Good as well");
                }
                break;
        
            default:
                System.out.println("Invalid");
                break;
        }
        sc.close();
    }
}
