public class pattern_Search {
    public static void main(String[] args){
        String txt="geeks for geeks";
        String pat="geeks";
        int pos=txt.indexOf(pat);
        while(pos>=0){
            System.out.print(pos + " ");
            pos=txt.indexOf(pat,pos+1);
        }
    }
}
