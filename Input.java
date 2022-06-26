import java.util.*;

class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); //next() --> only prints single token
        System.out.println(name);
        
        Scanner sc1 = new Scanner(System.in);
        String name1 = sc1.nextLine(); //nextLine() --> prints single Line
        System.out.println(name1);

        //nextInt --> Integer input
        //nextFloat --> Float input

        sc.close();
        sc1.close();
    }
}
