package condition;

import java.util.Scanner;

public class nested2 {
            public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                int a= sc.nextInt();
                if(a%2==0){
                    System.out.println("it is an even number");

                }
                else{
                    System.out.print("it is an odd number");
                }
                sc.close();
            }    
}
