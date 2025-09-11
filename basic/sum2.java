package basic;

import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        for(int i=0;i<=n;i++){
            res+=i;
        }
        System.out.println(res);
        sc.close();

    }
    
}
