package basic;
import java.util.Scanner;

public class sum_nth_term {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int n=sc.nextInt();
        int d=sc.nextInt();
         
        System.out.print(a+(n-1)*d);
    sc.close();

    }
}
