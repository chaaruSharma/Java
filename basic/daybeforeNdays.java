package basic;

public class daybeforeNdays {
    public static void main(String[] args) {
        java.util.Scanner sc =new java.util.Scanner(System.in);
        int d= sc.nextInt();
        int n= sc.nextInt();
        int ans=d-n;
        if(ans<0){
            ans=ans+7;
        }
        System.out.println(ans);
        sc.close();
    }
}
