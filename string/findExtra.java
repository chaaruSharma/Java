public class findExtra {
    public static void main(String[] args){
        String s1="abcd",s2="abcde";
        int res=0;
        int n=s1.length();
        System.out.println(n);
        for(int i=0;i<n;i++){
            res=res^s1.charAt(i)^s2.charAt(i);
            // res=res^s2.charAt(n);
            System.out.print((char)(res));

        }
res=res^s2.charAt(n);
        System.out.println((char)(res));
    }
}
