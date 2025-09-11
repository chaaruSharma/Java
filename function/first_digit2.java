

import java.util.Scanner;

public class first_digit2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(test(n));
        sc.close();
    }
    public static int test(int n){
        double power=Math.log10(n);
        int s=(int)power;
        double p=Math.pow(10,s);
        int a= (int)p;

        int ans=n/a;
        return ans;
    }
}
