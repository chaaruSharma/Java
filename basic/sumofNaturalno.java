package basic;

public class sumofNaturalno {
    public static void main(String[] args) {
        java.util.Scanner sc= new java.util.Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);

        int a=0;
        a=(n*(n+1))/2;
        System.out.println(a);
        sc.close();
    }
}
