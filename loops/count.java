package loops;

public class count {
    public static void main(String[] args) {
        int n, ans;
        java.util.Scanner sc= new java.util.Scanner(System.in);
        n= sc.nextInt();
        ans=0;
        while(n>0){
            n=n/10;
            ans++;
        }
        System.out.println(ans);
        sc.close();
    }
}
