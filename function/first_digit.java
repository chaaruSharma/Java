import java.util.Scanner;

public class first_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        test(input);
        sc.close();
    }

    public static void test( int input){
        for(int i=0;i<input;i++){
            // input=input/10;
            if(input<10){
                    break;
            }
            else{
                input=input/10;
            }

        }
            System.out.println(input);

    }
    
}
