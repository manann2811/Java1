import java.util.*;
public class TableFunction {
    public static void createTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        createTable(n);
        sc.close();
    }
}
