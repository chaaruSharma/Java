import java.util.Scanner;

public class prime_Factorisation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        test( n);
        sc.close();
    }

    
       public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;

            }
           
        }
         return true;
       }


    public static void test(int n) {
        for (int i=2;i<n;i++){
            if(isPrime(i)){
                int x=i;
                while(n%x==0){
                    System.out.println(i);
                    x=x*i;
                }
            }
        }
    }

}