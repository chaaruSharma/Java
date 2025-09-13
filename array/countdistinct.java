package array;

import java.util.Scanner;

public class countdistinct {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter your elements here : ");
            arr[i]=sc.nextInt();
            }
        System.out.print(countDigits(n,arr));
        sc.close();

        }
        public static int countDigits(int n,int arr[]){
            int count=0;boolean isDistinct=true;
            for(int i=0;i<n;i++){
                for(int j=(i-1);j>=0;j--){
                    if(arr[i]==arr[j]){
                        isDistinct=false;
                        break;
                    }         
               
                } 
                 if(isDistinct==true){
                    count++; 
            }
            }
                return count;     

        }
    }