package array;


import java.util.Scanner;
class sorted{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array here : ");

        int n= sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the elements : ");
            a[i]=sc.nextInt();
        }
        Boolean ans=is_sorted(a,n);
            if(ans==true){
                System.out.print("yes");
            }else{
                System.out.print("No");
            }
            sc.close();
        
       
    }
     public static boolean is_sorted(int[]a,int n){
        for(int i=1;i<n;i++){
            if (a[i]<a[i-1]){
                return false;
            }
           
        }
     return true;}}
