package array;

import java.util.Scanner;

public class jagged {
    public static void main(String[] args) {
        int n=3;
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<arr.length;i++){
            arr[i]=new int[i+1];
            for(int j=0;i<arr[i].length;j++){
                arr[i][j]=i;
                System.out.println(arr[i][j]);
            }
        }sc.close();
    }
}
