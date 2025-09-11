package basic;
import java.util.Scanner;
// import java.util.scanner;
public class sum_gp {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=sc.nextInt();
        int n=sc.nextInt();
        
        double res=Math.pow(r,n-1);
        System.out.print(res*a);
        sc.close();
    }
}