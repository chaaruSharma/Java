package basic;

public class lastDigitofNum {
    public static void main(String[] args) {
    java.util.Scanner sc =new java.util.Scanner(System.in);
  
    int a= sc.nextInt();

   int ans= a%10;
    if (ans<0){
        ans=ans*(-1);
    }
    System.out.println(ans);
    sc.close();
}}
