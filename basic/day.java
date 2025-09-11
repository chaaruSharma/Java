// day before n day

package basic;

import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int b=sc.nextInt();
        int res=d-b;
        if(res<0){
            res+=7;
        }
        System.out.println(res);
    sc.close();

    if(res==1)
    System.out.println("monday");

    
    else if(res==2)
    System.out.println("tuesday");

    else if(res==3)
    System.out.println("wednesday");
    else if(res==4)
    System.out.println("Thursday");
    else if(res==5)
    System.out.println("friday");
    else if(res==6)
    System.out.println("saturday");
    else
    System.out.print("sunday");
}
}