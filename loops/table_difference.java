package loops;

public class table_difference {
    public static void main(String[] args){
int n, m;
java.util.Scanner sc= new java.util.Scanner(System.in);
n= sc.nextInt();
m= sc.nextInt();
for(int i=1; i<=10; i++){
   System.out.print(n-m*i+" ");
    }
    sc.close();
}
}